package edu.ldcollege.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;

    private String qq;

    private String password;

    private String token;

    private String name;

    private String namespell;

    private String email;

    private Integer sex;

    private Integer age;

    private String education;

    private Integer workyear;

    private String province;

    private String city;

    private String phone;

    private String company;

    private String selfintroduction;

    private String weixin;

    private Date createtime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNamespell() {
        return namespell;
    }

    public void setNamespell(String namespell) {
        this.namespell = namespell == null ? null : namespell.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Integer getWorkyear() {
        return workyear;
    }

    public void setWorkyear(Integer workyear) {
        this.workyear = workyear;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getSelfintroduction() {
        return selfintroduction;
    }

    public void setSelfintroduction(String selfintroduction) {
        this.selfintroduction = selfintroduction == null ? null : selfintroduction.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", qq='" + qq + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", name='" + name + '\'' +
                ", namespell='" + namespell + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", workyear=" + workyear +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", company='" + company + '\'' +
                ", selfintroduction='" + selfintroduction + '\'' +
                ", weixin='" + weixin + '\'' +
                ", createtime=" + createtime +
                ", remark='" + remark + '\'' +
                '}';
    }
}