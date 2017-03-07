package edu.ldcollege.domain;

import java.io.Serializable;
import java.util.Date;

public class User2Class implements Serializable {
    private Integer id;

    private Integer userid;

    private Integer classid;

    private Date createtime;

    private Integer state;

    private Byte reasontype;

    private Integer season;

    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Byte getReasontype() {
        return reasontype;
    }

    public void setReasontype(Byte reasontype) {
        this.reasontype = reasontype;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}