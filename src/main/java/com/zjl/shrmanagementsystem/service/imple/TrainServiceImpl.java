package com.zjl.shrmanagementsystem.service.imple;

import com.zjl.shrmanagementsystem.dao.TrainMapper;
import com.zjl.shrmanagementsystem.domain.Train;
import com.zjl.shrmanagementsystem.service.ITrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainServiceImpl implements ITrainService {

    @Autowired
    private TrainMapper trainMapper;

    @Override
    public int deleteByPrimaryKey(Integer trainId) {
        return trainMapper.deleteByPrimaryKey(trainId);
    }

    @Override
    public int insert(Train record) {
        return trainMapper.insert(record);
    }

    @Override
    public int insertSelective(Train record) {
        return trainMapper.insertSelective(record);
    }

    @Override
    public Train selectByPrimaryKey(Integer trainId) {
        return trainMapper.selectByPrimaryKey(trainId);
    }

    @Override
    public int updateByPrimaryKeySelective(Train record) {
        return trainMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Train record) {
        return trainMapper.updateByPrimaryKey(record);
    }
}
