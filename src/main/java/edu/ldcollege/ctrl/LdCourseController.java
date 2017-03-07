package edu.ldcollege.ctrl;

import com.alibaba.fastjson.JSONObject;
import edu.ldcollege.domain.Course;
import edu.ldcollege.mapping.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by shenli on 2017/3/7.
 */
@Controller
@RequestMapping(value = "/ldcourse")
public class LdCourseController {

    @Autowired
    private CourseMapper courseDao;

    @RequestMapping("listByClassId")
    @ResponseBody
    public JSONObject listByClassId(Integer classId) {
        JSONObject rst = new JSONObject();
        List<Course> courses = courseDao.selectByClassId(classId);
        rst.put("success",true);
        rst.put("data", courses);
        return rst;
    }
}
