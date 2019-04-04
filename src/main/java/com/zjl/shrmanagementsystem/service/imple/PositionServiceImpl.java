package com.zjl.shrmanagementsystem.service.imple;

import com.zjl.shrmanagementsystem.dao.PositionMapper;
import com.zjl.shrmanagementsystem.domain.Position;
import com.zjl.shrmanagementsystem.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements IPositionService {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public int deleteByPrimaryKey(Integer positionId) {
        return positionMapper.deleteByPrimaryKey(positionId);
    }

    @Override
    public int insert(Position record) {
        return positionMapper.insert(record);
    }

    @Override
    public int insertSelective(Position record) {
        return positionMapper.insertSelective(record);
    }

    @Override
    public Position selectByPrimaryKey(Integer positionId) {
        return positionMapper.selectByPrimaryKey(positionId);
    }

    @Override
    public int updateByPrimaryKeySelective(Position record) {
        return positionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Position record) {
        return positionMapper.updateByPrimaryKey(record);
    }
}
