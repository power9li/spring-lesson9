package edu.ldcollege.ctrl;

import com.alibaba.fastjson.JSONObject;
import edu.ldcollege.domain.LdClass;
import edu.ldcollege.domain.LdClassExample;
import edu.ldcollege.domain.User;
import edu.ldcollege.domain.User2ClassExample;
import edu.ldcollege.mapping.LdClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by shenli on 2017/3/6.
 */
@Controller
@RequestMapping(value = "/ldClass")
public class LdClassController {

    @Autowired
    private LdClassMapper classDao;

    @RequestMapping(value = "findAll")
    @ResponseBody
    public JSONObject findAll(){
        System.out.println("LdClassController.findAll");
        LdClassExample example = new LdClassExample();
        List<LdClass> ldClasses = classDao.selectByExample(example);
        System.out.println("ldClasses.size() = " + ldClasses.size());
        JSONObject response = new JSONObject();
        response.put("success", true);
        response.put("data", ldClasses);
        return response;
    }

    @RequestMapping(value = "loadByUserId")
    @ResponseBody
    public JSONObject loadClassByUserId(HttpServletRequest req, Integer userId) {
        JSONObject response = new JSONObject();
        if(userId == null) {
            Object o = req.getSession().getAttribute("loginUser");
            if (o != null && o instanceof User) {
                User u = (User) o;
                userId = u.getId();
            }
        }
        if (userId != null) {
            User2ClassExample example = new User2ClassExample();
            example.createCriteria().andUseridEqualTo(userId);
            List<LdClass> userClasses = classDao.selectByUserId(userId);
            if (userClasses != null) {
                System.out.println("userClasses = " + userClasses);
            }
            response.put("success", true);
            response.put("data", userClasses);
        }
        else {
            response.put("success", false);
            response.put("reason", "not userId or session timeout.l");
        }
        return response;
    }
}
