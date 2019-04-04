package com.zjl.shrmanagementsystem.dao;

import com.zjl.shrmanagementsystem.domain.CheckWorkAttendanceInfo;

public interface CheckWorkAttendanceInfoMapper {
    int deleteByPrimaryKey(Integer cwaiId);

    int insert(CheckWorkAttendanceInfo record);

    int insertSelective(CheckWorkAttendanceInfo record);

    CheckWorkAttendanceInfo selectByPrimaryKey(Integer cwaiId);

    int updateByPrimaryKeySelective(CheckWorkAttendanceInfo record);

    int updateByPrimaryKey(CheckWorkAttendanceInfo record);
}