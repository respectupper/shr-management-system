package com.zjl.shrmanagementsystem.domain;

import java.sql.Date;

//奖惩记录
public class RewardsAndPenalties {
    private Integer rapId;
//    0代表奖励，1代表惩罚
    private Integer rP;
    private String rapDetails;
    private User user;
    private Double rapSalary;
    private Date createDate;
    private Date updateDate;

    public RewardsAndPenalties() {
    }

    public Integer getRapId() {
        return rapId;
    }

    public void setRapId(Integer rapId) {
        this.rapId = rapId;
    }

    public Integer getrP() {
        return rP;
    }

    public void setrP(Integer rP) {
        this.rP = rP;
    }

    public String getRapDetails() {
        return rapDetails;
    }

    public void setRapDetails(String rapDetails) {
        this.rapDetails = rapDetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getRapSalary() {
        return rapSalary;
    }

    public void setRapSalary(Double rapSalary) {
        this.rapSalary = rapSalary;
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
        return "RewardsAndPenalties{" +
                "rapId=" + rapId +
                ", rP=" + rP +
                ", rapDetails='" + rapDetails + '\'' +
                ", user=" + user +
                ", rapSalary=" + rapSalary +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
