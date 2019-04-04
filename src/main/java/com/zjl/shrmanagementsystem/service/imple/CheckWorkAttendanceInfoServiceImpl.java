package com.zjl.shrmanagementsystem.service.imple;

import com.zjl.shrmanagementsystem.dao.CheckWorkAttendanceInfoMapper;
import com.zjl.shrmanagementsystem.domain.CheckWorkAttendanceInfo;
import com.zjl.shrmanagementsystem.service.ICheckWorkAttendanceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckWorkAttendanceInfoServiceImpl implements ICheckWorkAttendanceInfoService {

    @Autowired
    private CheckWorkAttendanceInfoMapper checkWorkAttendanceInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer cwaiId) {
        return checkWorkAttendanceInfoMapper.deleteByPrimaryKey(cwaiId);
    }

    @Override
    public int insert(CheckWorkAttendanceInfo record) {
        return checkWorkAttendanceInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(CheckWorkAttendanceInfo record) {
        return checkWorkAttendanceInfoMapper.insertSelective(record);
    }

    @Override
    public CheckWorkAttendanceInfo selectByPrimaryKey(Integer cwaiId) {
        return checkWorkAttendanceInfoMapper.selectByPrimaryKey(cwaiId);
    }

    @Override
    public int updateByPrimaryKeySelective(CheckWorkAttendanceInfo record) {
        return checkWorkAttendanceInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CheckWorkAttendanceInfo record) {
        return checkWorkAttendanceInfoMapper.updateByPrimaryKey(record);
    }
}
