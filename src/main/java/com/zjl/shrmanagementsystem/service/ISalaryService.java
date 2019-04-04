package com.zjl.shrmanagementsystem.service;

import com.zjl.shrmanagementsystem.domain.Salary;

public interface ISalaryService {
    int deleteByPrimaryKey(Integer salaryId);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer salaryId);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);
}