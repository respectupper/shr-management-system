package com.zjl.shrmanagementsystem.service;

import com.zjl.shrmanagementsystem.domain.Department;

import java.util.List;

public interface IDepartmentService {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> queryAll();
}