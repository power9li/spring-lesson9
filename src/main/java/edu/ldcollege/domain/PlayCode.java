package edu.ldcollege.domain;

import java.io.Serializable;
import java.util.Date;

public class PlayCode implements Serializable {
    private Integer id;

    private Integer userid;

    private String encryptionbatch;

    private String machinecode;

    private Date createtime;

    private String code;

    private Integer validityperiod;

    private Integer type;

    private Integer state;

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

    public String getEncryptionbatch() {
        return encryptionbatch;
    }

    public void setEncryptionbatch(String encryptionbatch) {
        this.encryptionbatch = encryptionbatch == null ? null : encryptionbatch.trim();
    }

    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode == null ? null : machinecode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getValidityperiod() {
        return validityperiod;
    }

    public void setValidityperiod(Integer validityperiod) {
        this.validityperiod = validityperiod;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}