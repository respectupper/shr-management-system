package com.zjl.shrmanagementsystem.service.imple;

import com.zjl.shrmanagementsystem.dao.RewardsAndPenaltiesMapper;
import com.zjl.shrmanagementsystem.domain.RewardsAndPenalties;
import com.zjl.shrmanagementsystem.service.IRewardsAndPenaltiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardsAndPenaltiesServiceImpl implements IRewardsAndPenaltiesService {

    @Autowired
    private RewardsAndPenaltiesMapper rewardsAndPenaltiesMapper;

    @Override
    public int deleteByPrimaryKey(Integer rapId) {
        return rewardsAndPenaltiesMapper.deleteByPrimaryKey(rapId);
    }

    @Override
    public int insert(RewardsAndPenalties record) {
        return rewardsAndPenaltiesMapper.insert(record);
    }

    @Override
    public int insertSelective(RewardsAndPenalties record) {
        return rewardsAndPenaltiesMapper.insertSelective(record);
    }

    @Override
    public RewardsAndPenalties selectByPrimaryKey(Integer rapId) {
        return rewardsAndPenaltiesMapper.selectByPrimaryKey(rapId);
    }

    @Override
    public int updateByPrimaryKeySelective(RewardsAndPenalties record) {
        return rewardsAndPenaltiesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RewardsAndPenalties record) {
        return rewardsAndPenaltiesMapper.updateByPrimaryKey(record);
    }
}
