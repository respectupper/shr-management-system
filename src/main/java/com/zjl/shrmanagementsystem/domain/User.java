package com.zjl.shrmanagementsystem.domain;

import java.sql.Date;

public class User {

    private Integer userId;
    private String userPhone;
    private String userName;
    private String userPwd;
    //部门
    private Department department;
    //职位
    private Position position;
    private Double salary;
    private Date createDate;
    private Date updateDate;

    public User() {
    }

    public User(String userPhone) {
        this.userPhone = userPhone;
    }

    public User(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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
        return "User{" +
                "userId=" + userId +
                ", userPhone='" + userPhone + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", salary=" + salary +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
