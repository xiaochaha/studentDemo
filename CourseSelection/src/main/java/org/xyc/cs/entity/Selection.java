package org.xyc.cs.entity;

import java.util.Date;

public class Selection {
    private Integer selectionId;

    private Integer courseId;

    private Integer studentId;

    private String classroom;

    private String classtime;

    private Date createTime;

    private Date updateTime;

    public Selection(Integer selectionId, Integer courseId, Integer studentId, String classroom, String classtime, Date createTime, Date updateTime) {
        this.selectionId = selectionId;
        this.courseId = courseId;
        this.studentId = studentId;
        this.classroom = classroom;
        this.classtime = classtime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Selection() {
        super();
    }

    public Integer getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(Integer selectionId) {
        this.selectionId = selectionId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom == null ? null : classroom.trim();
    }

    public String getClasstime() {
        return classtime;
    }

    public void setClasstime(String classtime) {
        this.classtime = classtime == null ? null : classtime.trim();
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