package com.zjl.shrmanagementsystem.service.imple;

import com.zjl.shrmanagementsystem.dao.SalaryMapper;
import com.zjl.shrmanagementsystem.domain.Salary;
import com.zjl.shrmanagementsystem.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;

public class SalaryServiceImpl implements ISalaryService {

    @Autowired
    private SalaryMapper salaryMapper;

    @Override
    public int deleteByPrimaryKey(Integer salaryId) {
        return salaryMapper.deleteByPrimaryKey(salaryId);
    }

    @Override
    public int insert(Salary record) {
        return salaryMapper.insert(record);
    }

    @Override
    public int insertSelective(Salary record) {
        return salaryMapper.insertSelective(record);
    }

    @Override
    public Salary selectByPrimaryKey(Integer salaryId) {
        return salaryMapper.selectByPrimaryKey(salaryId);
    }

    @Override
    public int updateByPrimaryKeySelective(Salary record) {
        return salaryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Salary record) {
        return salaryMapper.updateByPrimaryKey(record);
    }
}
