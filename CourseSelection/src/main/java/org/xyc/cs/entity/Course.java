package org.xyc.cs.entity;

import java.util.Date;

public class Course {
    private Integer courseId;

    private String courseName;

    private Date courseTime;

    private Integer teacherId;

    private Date createTime;

    private Date updateTime;

    public Course(Integer courseId, String courseName, Date courseTime, Integer teacherId, Date createTime, Date updateTime) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseTime = courseTime;
        this.teacherId = teacherId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Course() {
        super();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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