package org.xyc.cs.entity;

import java.util.Date;

public class Major {
    private Integer majorId;

    private String majorName;

    private Date createTime;

    private Date updateTime;

    public Major(Integer majorId, String majorName, Date createTime, Date updateTime) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Major() {
        super();
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
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