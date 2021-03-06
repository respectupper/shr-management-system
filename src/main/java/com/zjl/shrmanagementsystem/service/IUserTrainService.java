package com.zjl.shrmanagementsystem.service;

import com.zjl.shrmanagementsystem.domain.UserTrain;

public interface IUserTrainService {
    int deleteByPrimaryKey(Integer userTrainId);

    int insert(UserTrain record);

    int insertSelective(UserTrain record);

    UserTrain selectByPrimaryKey(Integer userTrainId);

    int updateByPrimaryKeySelective(UserTrain record);

    int updateByPrimaryKey(UserTrain record);
}