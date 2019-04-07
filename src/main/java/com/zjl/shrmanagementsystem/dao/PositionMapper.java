package com.zjl.shrmanagementsystem.dao;

import com.zjl.shrmanagementsystem.domain.Position;

import java.util.List;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer positionId);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer positionId);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    List<Position> queryPositionByDepartmentId(int department_id);
}