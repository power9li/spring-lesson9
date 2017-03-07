package edu.ldcollege.domain;

import java.io.Serializable;

public class Province implements Serializable {
    private Integer provinceid;

    private String provincename;

    private String abbreviate;

    private static final long serialVersionUID = 1L;

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }

    public String getAbbreviate() {
        return abbreviate;
    }

    public void setAbbreviate(String abbreviate) {
        this.abbreviate = abbreviate == null ? null : abbreviate.trim();
    }
}