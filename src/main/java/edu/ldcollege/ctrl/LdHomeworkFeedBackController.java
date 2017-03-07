package edu.ldcollege.ctrl;

import com.alibaba.fastjson.JSONObject;
import edu.ldcollege.domain.LdHomeWorkFB;
import edu.ldcollege.domain.LdHomeWorkFBVo;
import edu.ldcollege.domain.User;
import edu.ldcollege.mapping.LdHomeWorkFBMapper;
import edu.ldcollege.mapping.LdHomeWorkMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by shenli on 2017/2/26.
 */
@Controller
@RequestMapping(value = "/ldhomeworkfb")
public class LdHomeworkFeedBackController {

    private static final Logger log = LoggerFactory.getLogger(LdHomeworkFeedBackController.class);

    @Autowired
    private LdHomeWorkFBMapper feedBackDao;

    @Autowired
    private LdHomeWorkMapper homeWorkDao;



    @RequestMapping(value = "evaluation")
    @ResponseBody
    @Transactional
    public JSONObject evaluation(HttpServletRequest req, String evaluation, String levelFlag, int addStart, int delStart,
                                  int userId, int homeworkId){
        System.out.println("LdHomeworkFeedBackController.evaluation");
        System.out.println("evaluation = " + evaluation);
        System.out.println("levelFlag = " + levelFlag);
        System.out.println("addStart = " + addStart);
        System.out.println("delStart = " + delStart);

        System.out.println("userId = " + userId);
        System.out.println("homeworkId = " + homeworkId);

        Object o = req.getSession().getAttribute("loginUser");
        System.out.println("req.getSession().getAttribute(\"loginUser\") = " + o);
        JSONObject response = new JSONObject();
        if (o != null && o instanceof User) {
            User u = (User)o;
            Integer myId = u.getId();
            System.out.println("myId = " + myId);

            Assert.notNull(homeworkId);
            Assert.notNull(userId);
            Assert.notNull(levelFlag);
            Assert.notNull(myId);
            Assert.notNull(evaluation);

            LdHomeWorkFB fb = new LdHomeWorkFB();
            fb.setHomeworkId(homeworkId);
            fb.setUserId(userId);
            fb.setLevelFlag(levelFlag);
            fb.setMyId(myId);
            fb.setMark(evaluation);
            feedBackDao.insert(fb);
            homeWorkDao.updateCountsById(addStart, delStart, Integer.valueOf(homeworkId));
            response.put("success", true);

        }
        else{
            response.put("success", false);
            response.put("reason", "session timeout.");
        }
        return response;


    }

    @RequestMapping(value = "feedbacks")
    @ResponseBody
    public JSONObject getByHomeworkId(String homeworkId) {
        Assert.notNull(homeworkId);
        JSONObject response = new JSONObject();
//        LdHomeWorkFBExample example = new LdHomeWorkFBExample();
//        example.createCriteria().andHomeworkIdEqualTo(Integer.parseInt(homeworkId));
//        List<LdHomeWorkFB> ldHomeWorkFBs = feedBackDao.selectByExample(example);
        List<LdHomeWorkFBVo> hwvos = feedBackDao.findHomeWorkFBVos(Integer.valueOf(homeworkId));
        response.put("evas", hwvos);
        response.put("success", true);
        return response;
    }


}
