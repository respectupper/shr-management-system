package com.zjl.shrmanagementsystem.service;

import com.zjl.shrmanagementsystem.domain.Position;

public interface IPositionService {
    int deleteByPrimaryKey(Integer positionId);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer positionId);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}