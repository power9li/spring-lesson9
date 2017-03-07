package edu.ldcollege.ctrl;

import com.alibaba.fastjson.JSONObject;
import edu.ldcollege.domain.SysUser;
import edu.ldcollege.domain.SysUserExample;
import edu.ldcollege.mapping.SysUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by shenli on 2017/3/7.
 */
@Controller
@RequestMapping(value = "/sysUser")
public class SysUserController {

    @Autowired
    private SysUserMapper sysUserDao;

    private static final Logger log = LoggerFactory.getLogger(SysUserController.class);

    @RequestMapping("findUser")
    @ResponseBody
    public JSONObject findByRoleAndClassId(String role,Integer classId){
        log.info("SysUserController.findByRoleName");
        JSONObject response = new JSONObject();
        SysUserExample example = new SysUserExample();
        example.createCriteria().andRoleEqualTo(role);
        List<SysUser> sysUsers = sysUserDao.selectByExample(example);
        response.put("success", true);
        response.put("data", sysUsers);
        return response;
    }


}
