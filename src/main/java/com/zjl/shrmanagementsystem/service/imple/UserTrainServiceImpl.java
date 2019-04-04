package com.zjl.shrmanagementsystem.service.imple;

import com.zjl.shrmanagementsystem.dao.UserTrainMapper;
import com.zjl.shrmanagementsystem.domain.UserTrain;
import com.zjl.shrmanagementsystem.service.IUserTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTrainServiceImpl implements IUserTrainService {

    @Autowired
    private UserTrainMapper userTrainMapper;

    @Override
    public int deleteByPrimaryKey(Integer userTrainId) {
        return userTrainMapper.deleteByPrimaryKey(userTrainId);
    }

    @Override
    public int insert(UserTrain record) {
        return userTrainMapper.insert(record);
    }

    @Override
    public int insertSelective(UserTrain record) {
        return userTrainMapper.insertSelective(record);
    }

    @Override
    public UserTrain selectByPrimaryKey(Integer userTrainId) {
        return userTrainMapper.selectByPrimaryKey(userTrainId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserTrain record) {
        return userTrainMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserTrain record) {
        return userTrainMapper.updateByPrimaryKey(record);
    }
}
