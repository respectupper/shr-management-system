package com.zjl.shrmanagementsystem.domain;

import java.sql.Timestamp;

//考勤记录
public class CheckWorkAttendanceInfo {

    private Integer cwaiId;

    private User user;

    private Timestamp createDate;

    private Timestamp updateDate;

    public CheckWorkAttendanceInfo() {
    }

    public Integer getCwaiId() {
        return cwaiId;
    }

    public void setCwaiId(Integer cwaiId) {
        this.cwaiId = cwaiId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "CheckWorkAttendanceInfo{" +
                "cwaiId=" + cwaiId +
                ", user=" + user +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
