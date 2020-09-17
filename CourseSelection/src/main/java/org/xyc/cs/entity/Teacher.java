package org.xyc.cs.entity;

import java.util.Date;

public class Teacher {
    private Integer teacherId;

    private String teacherPassword;

    private String teacherName;

    private Date createTime;

    private Date updateTime;

    public Teacher(Integer teacherId, String teacherPassword, String teacherName, Date createTime, Date updateTime) {
        this.teacherId = teacherId;
        this.teacherPassword = teacherPassword;
        this.teacherName = teacherName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Teacher() {
        super();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword == null ? null : teacherPassword.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
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