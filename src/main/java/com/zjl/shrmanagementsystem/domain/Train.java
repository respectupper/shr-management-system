package com.zjl.shrmanagementsystem.domain;

import java.sql.Date;

//培训
public class Train {

    private Integer trainId;
    private String trainTitle;
    private String trainDetails;
    private Date startDate;
    private Date createDate;
    private Date updateDate;

    public Train() {
    }

    public Integer getTrainId() {
        return trainId;
    }

    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }

    public String getTrainTitle() {
        return trainTitle;
    }

    public void setTrainTitle(String trainTitle) {
        this.trainTitle = trainTitle;
    }

    public String getTrainDetails() {
        return trainDetails;
    }

    public void setTrainDetails(String trainDetails) {
        this.trainDetails = trainDetails;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
        return "Train{" +
                "trainId=" + trainId +
                ", trainTitle='" + trainTitle + '\'' +
                ", trainDetails='" + trainDetails + '\'' +
                ", startDate=" + startDate +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
