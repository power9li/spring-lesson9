package edu.ldcollege.domain;

import java.io.Serializable;

public class LdHomeWorkFB implements Serializable {
    private Integer id;

    private Integer myId;

    private Integer userId;

    private Integer homeworkId;

    private String levelFlag;

    private String mark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMyId() {
        return myId;
    }

    public void setMyId(Integer myId) {
        this.myId = myId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

    public String getLevelFlag() {
        return levelFlag;
    }

    public void setLevelFlag(String levelFlag) {
        this.levelFlag = levelFlag == null ? null : levelFlag.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}