package edu.ldcollege.ctrl;

import com.alibaba.fastjson.JSONObject;
import edu.ldcollege.domain.SysUserExample;
import edu.ldcollege.domain.User;
import edu.ldcollege.domain.UserExample;
import edu.ldcollege.login.UserSessionRepository;
import edu.ldcollege.mapping.SysUserMapper;
import edu.ldcollege.mapping.UserMapper;
import edu.ldcollege.utils.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

/**
 * Created by shenli on 2017/3/5.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private SysUserMapper sysUserDao;

    @Autowired
    private UserMapper userDao;

    @ResponseBody
    @Transactional
    @RequestMapping(value = "/go")
    public JSONObject login(String username, String password, boolean rememberMe, HttpServletResponse response){
        System.out.println("LoginController.login");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("rememberMe = " + rememberMe);

        JSONObject rst = new JSONObject();
        SysUserExample example = new SysUserExample();
        example.createCriteria()
                .andUsernameEqualTo(username)
                .andPasswordEqualTo(password);

        long count = sysUserDao.countByExample(example);
        if (count > 0) {
            String sessionId = UUID.randomUUID().toString();
            Cookie sessionCookie = new Cookie("sessionId", sessionId);
            sessionCookie.setPath("/");
            sessionCookie.setMaxAge(300);
            response.addCookie(sessionCookie);

            UserExample userExample = new UserExample();
            userExample.createCriteria().andNameEqualTo(username);
            List<User> users = userDao.selectByExample(userExample);
            if(users != null && users.size() > 0) {
                User user = users.get(0);
                System.out.println("user = " + user);
                UserSessionRepository.put(sessionId, user);
                rst.put("success", true);
            }
            else{
                rst.put("success", false);
                rst.put("reason", "无法获取用户详细信息");
            }
        }
        else {
            rst.put("success", false);
            rst.put("reason", "未知的用户名");
        }
        return rst;
    }

    @RequestMapping(value = "logout")
    @ResponseBody
    public JSONObject logout(HttpServletRequest req,HttpServletResponse response){
        JSONObject rst = new JSONObject();
        Cookie sessionCk = CookieUtils.getCookie(req,"sessionId");
        if (sessionCk != null) {
            String sessionId = sessionCk.getValue();
            UserSessionRepository.del(sessionId);
            req.getSession().removeAttribute("loginUser");
            Cookie ck = new Cookie("sessionId", "");
            ck.setMaxAge(0);
            ck.setDomain("/");
            response.addCookie(ck);
            rst.put("success", true);
        }
        else{
            rst.put("success", false);
        }
        return rst;
    }
}
