package edu.ldcollege.ctrl;

import com.alibaba.fastjson.JSONObject;
import edu.ldcollege.domain.LdHomeWork;
import edu.ldcollege.domain.User;
import edu.ldcollege.service.LdHomeWorkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/ldhomework")
public class LdHomeworkController {

	@Autowired
	private LdHomeWorkService ldHomeWorkService;

	private static final Logger log = LoggerFactory.getLogger(LdHomeworkController.class);

	@RequestMapping(value = "list")
	@ResponseBody
	public JSONObject homeWorks(){
		List<LdHomeWork> homeWorks = ldHomeWorkService.getAll();
		System.out.println("HomeworkController.homeWorks()");
		log.info("homeWorks.size={}",homeWorks.size());
		JSONObject jo = new JSONObject();
		jo.put("success", true);
		jo.put("homeworkLists", homeWorks);
		return jo;
	}

	@RequestMapping(value = "completedList")
	@ResponseBody
	public JSONObject completedList(){
		List<LdHomeWork> homeWorks = null;
		homeWorks = ldHomeWorkService.findAllCompleted();
		System.out.println("HomeworkController.completedList()");
		log.info("completedList.size={}",homeWorks.size());
		JSONObject jo = new JSONObject();
		jo.put("success", true);
		jo.put("homeworkLists", homeWorks);
		return jo;
	}

	@RequestMapping(value = "upload",produces = "application/json")
	@ResponseBody
	public JSONObject upload(HttpServletRequest req,
			 @RequestParam("file") MultipartFile file,
//			 @RequestParam("userId")  Integer userId,
			 @RequestParam("classId") Integer classId,
			 @RequestParam("lessonId") Integer lessonId) throws IOException {

		log.info("HomeworkController.upload");
		Object o = req.getSession().getAttribute("loginUser");
		JSONObject response = new JSONObject();
		if (o != null && o instanceof User) {
			User u = (User)o;
			Integer userId = u.getId();
			LdHomeWork homeWork = new LdHomeWork();
			homeWork.setHomeworkFileName(file.getOriginalFilename());
			homeWork.setCreateDate(new Date());
			homeWork.setClassId(classId);
			homeWork.setLessionId(lessonId);
			homeWork.setUserId(userId);
			homeWork.setBestFlag(false);
			homeWork.setCorrectFlag(false);
			homeWork.setStartCount(0);
			homeWork.setNegativeCount(0);

			boolean rst = ldHomeWorkService.checkAndSaveHomeWork(file, homeWork);
			response.put("success", rst);
		}
		else {
			response.put("success", false);
			response.put("reason", "session timeout.");
		}
		return response;
	}

    @RequestMapping("tryme")
    public String tryme(ModelMap map) {
        map.put("title", "tryMe");
		if(true)
        	throw new RuntimeException("发生错误");
        return "test";
    }


}
