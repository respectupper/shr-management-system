package com.zjl.shrmanagementsystem.service;

import com.zjl.shrmanagementsystem.domain.RewardsAndPenalties;

public interface IRewardsAndPenaltiesService {
    int deleteByPrimaryKey(Integer rapId);

    int insert(RewardsAndPenalties record);

    int insertSelective(RewardsAndPenalties record);

    RewardsAndPenalties selectByPrimaryKey(Integer rapId);

    int updateByPrimaryKeySelective(RewardsAndPenalties record);

    int updateByPrimaryKey(RewardsAndPenalties record);
}