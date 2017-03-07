package edu.ldcollege.domain;

import java.io.Serializable;
import java.util.Date;

public class LdClass implements Serializable {
    private Integer id;

    private String classname;

    private Date createtime;

    private Date endtime;

    private String remark;

    private String monitorName;

    private String commissaryName;

    private Integer curnormalstudents;

    private Integer curArrearagedStudents;

    private Integer dropedStudents;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMonitorName() {
        return monitorName;
    }

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName == null ? null : monitorName.trim();
    }

    public String getCommissaryName() {
        return commissaryName;
    }

    public void setCommissaryName(String commissaryName) {
        this.commissaryName = commissaryName == null ? null : commissaryName.trim();
    }

    public Integer getCurnormalstudents() {
        return curnormalstudents;
    }

    public void setCurnormalstudents(Integer curnormalstudents) {
        this.curnormalstudents = curnormalstudents;
    }

    public Integer getCurArrearagedStudents() {
        return curArrearagedStudents;
    }

    public void setCurArrearagedStudents(Integer curArrearagedStudents) {
        this.curArrearagedStudents = curArrearagedStudents;
    }

    public Integer getDropedStudents() {
        return dropedStudents;
    }

    public void setDropedStudents(Integer dropedStudents) {
        this.dropedStudents = dropedStudents;
    }

    @Override
    public String toString() {
        return "LdClass{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", createtime=" + createtime +
                ", endtime=" + endtime +
                ", remark='" + remark + '\'' +
                ", monitorName='" + monitorName + '\'' +
                ", commissaryName='" + commissaryName + '\'' +
                ", curnormalstudents=" + curnormalstudents +
                ", curArrearagedStudents=" + curArrearagedStudents +
                ", dropedStudents=" + dropedStudents +
                '}';
    }
}