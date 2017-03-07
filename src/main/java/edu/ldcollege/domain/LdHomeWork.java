package edu.ldcollege.domain;

import java.io.Serializable;
import java.util.Date;

public class LdHomeWork implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer classId;

    private Integer lessionId;

    private String homeworkFilePath;

    private String homeworkFileName;

    private Date createDate;

    private Boolean correctFlag;

    private Integer startCount;

    private Integer negativeCount;

    private Boolean bestFlag;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getLessionId() {
        return lessionId;
    }

    public void setLessionId(Integer lessionId) {
        this.lessionId = lessionId;
    }

    public String getHomeworkFilePath() {
        return homeworkFilePath;
    }

    public void setHomeworkFilePath(String homeworkFilePath) {
        this.homeworkFilePath = homeworkFilePath == null ? null : homeworkFilePath.trim();
    }

    public String getHomeworkFileName() {
        return homeworkFileName;
    }

    public void setHomeworkFileName(String homeworkFileName) {
        this.homeworkFileName = homeworkFileName == null ? null : homeworkFileName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getCorrectFlag() {
        return correctFlag;
    }

    public void setCorrectFlag(Boolean correctFlag) {
        this.correctFlag = correctFlag;
    }

    public Integer getStartCount() {
        return startCount;
    }

    public void setStartCount(Integer startCount) {
        this.startCount = startCount;
    }

    public Integer getNegativeCount() {
        return negativeCount;
    }

    public void setNegativeCount(Integer negativeCount) {
        this.negativeCount = negativeCount;
    }

    public Boolean getBestFlag() {
        return bestFlag;
    }

    public void setBestFlag(Boolean bestFlag) {
        this.bestFlag = bestFlag;
    }
}