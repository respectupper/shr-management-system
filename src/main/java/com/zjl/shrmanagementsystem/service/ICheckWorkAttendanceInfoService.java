package com.zjl.shrmanagementsystem.service;

import com.zjl.shrmanagementsystem.domain.CheckWorkAttendanceInfo;

public interface ICheckWorkAttendanceInfoService {
    int deleteByPrimaryKey(Integer cwaiId);

    int insert(CheckWorkAttendanceInfo record);

    int insertSelective(CheckWorkAttendanceInfo record);

    CheckWorkAttendanceInfo selectByPrimaryKey(Integer cwaiId);

    int updateByPrimaryKeySelective(CheckWorkAttendanceInfo record);

    int updateByPrimaryKey(CheckWorkAttendanceInfo record);
}