package com.zjl.shrmanagementsystem.domain;

import java.sql.Date;

public class UserTrain {
    private Integer userTrainId;
    private Train train;
    private User user;
    private Date createDate;
    private Date updateDate;

    public UserTrain() {
    }

    public Integer getUserTrainId() {
        return userTrainId;
    }

    public void setUserTrainId(Integer userTrainId) {
        this.userTrainId = userTrainId;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "UserTrain{" +
                "userTrainId=" + userTrainId +
                ", train=" + train +
                ", user=" + user +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
