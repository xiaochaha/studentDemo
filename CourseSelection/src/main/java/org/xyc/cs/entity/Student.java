package org.xyc.cs.entity;

import java.util.Date;

public class Student {
    private Integer stuId;

    private String stuPassword;

    private String stuName;

    private String stuClass;

    private Integer majorId;

    private Date createTime;

    private Date updateTime;

    public Student(Integer stuId, String stuPassword, String stuName, String stuClass, Integer majorId, Date createTime, Date updateTime) {
        this.stuId = stuId;
        this.stuPassword = stuPassword;
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.majorId = majorId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Student() {
        super();
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword == null ? null : stuPassword.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass == null ? null : stuClass.trim();
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}