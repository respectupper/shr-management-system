package com.zjl.shrmanagementsystem.dao;

import com.zjl.shrmanagementsystem.domain.RewardsAndPenalties;

public interface RewardsAndPenaltiesMapper {
    int deleteByPrimaryKey(Integer rapId);

    int insert(RewardsAndPenalties record);

    int insertSelective(RewardsAndPenalties record);

    RewardsAndPenalties selectByPrimaryKey(Integer rapId);

    int updateByPrimaryKeySelective(RewardsAndPenalties record);

    int updateByPrimaryKey(RewardsAndPenalties record);
}