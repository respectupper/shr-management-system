package com.zjl.shrmanagementsystem.domain;

import java.sql.Date;

public class Salary {
    private Integer salaryId;
    private Double salaryCount;
    private Date createDate;
    private Date updateDate;

    public Salary() {
    }

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public Double getSalaryCount() {
        return salaryCount;
    }

    public void setSalaryCount(Double salaryCount) {
        this.salaryCount = salaryCount;
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
        return "Salary{" +
                "salaryId=" + salaryId +
                ", salaryCount=" + salaryCount +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
