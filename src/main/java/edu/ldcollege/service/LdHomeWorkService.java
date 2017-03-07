package edu.ldcollege.service;

import edu.ldcollege.domain.LdHomeWork;
import edu.ldcollege.mapping.LdHomeWorkMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

/**
 * Created by shenli on 2017/2/25.
 */
@Service
public class LdHomeWorkService {

    private static final Logger log = LoggerFactory.getLogger(LdHomeWorkService.class);

    @Autowired
    private LdHomeWorkMapper ldHomeWorkDao;

    @Value(value = "${upload.dir}")
    private String rootLocation;

    private static final String SPLIT_FLAG = "/";

    public List<LdHomeWork> getAll(){
        return ldHomeWorkDao.selectByExample(null);
    }

    /**
     * 检测是否有同样班级,课程,学号的作业,有则更新,无则添加
     * 方法没有引入事务管理,因为SQL只有一句,属于原子操作.
     * @param file 上传的作业文件
     * @param homeWork 作业对象
     * @return 是否操作成功
     * @throws IOException
     */
    public boolean checkAndSaveHomeWork(MultipartFile file, LdHomeWork homeWork) throws IOException {
        StringBuilder storeDirSB = new StringBuilder().append(rootLocation)
                .append("class_").append(homeWork.getClassId()).append(SPLIT_FLAG)
                .append("lesson_").append(homeWork.getLessionId()).append(SPLIT_FLAG)
                .append("user_").append(homeWork.getUserId()).append(SPLIT_FLAG);

        String storeDir = storeDirSB.toString();
        String storePath = storeDirSB.append(file.getOriginalFilename()).toString();

        log.debug("storeDir = "+storeDir+" ,storePath = " + storePath);
        File storeDirF = new File(storeDir);
        File oldFile = null;
        if(!storeDirF.exists()){
            storeDirF.mkdirs();
        }
        else{
            Optional<Path> first1 = Files.list(Paths.get(storeDir)).findFirst();
            if (!first1.equals(Optional.empty())) {
                Path first = first1.get();
                oldFile = first.toFile();
            }
        }
        Files.copy(file.getInputStream(), Paths.get(storePath), StandardCopyOption.REPLACE_EXISTING);
        homeWork.setHomeworkFilePath(storePath);

        try {
            //根据unique规则,添加或更新记录.
            //(如果行作为新记录被插入，则受影响行的值为1；如果原有的记录被更新，则受影响行的值为2)
            int affected = ldHomeWorkDao.uniqueInsert(homeWork);
            //成功更新后,删除老的文件
            if (affected == 2) {
                log.info("already exist seam (userId,classId,lessonId)'s record.");
                if (oldFile != null) {
                    oldFile.delete();
                    log.info("delete old home work file("+oldFile.getName()+")");
                }
            }
        }catch (Exception e){
            log.error("uniqueInsert error = "+e.getMessage());
            //更新DB失败,删除文件
            Files.delete(Paths.get(storePath));
            return false;
        }
        return true;
    }

    public List<LdHomeWork> findAllCompleted() {
        return ldHomeWorkDao.queryAllWorkNotNull();
    }
}
