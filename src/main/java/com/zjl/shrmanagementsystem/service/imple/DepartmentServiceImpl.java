package com.zjl.shrmanagementsystem.service.imple;

import com.zjl.shrmanagementsystem.dao.DepartmentMapper;
import com.zjl.shrmanagementsystem.domain.Department;
import com.zjl.shrmanagementsystem.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public int deleteByPrimaryKey(Integer departmentId) {
        return departmentMapper.deleteByPrimaryKey(departmentId);
    }

    @Override
    public int insert(Department record) {
        return departmentMapper.insert(record);
    }

    @Override
    public int insertSelective(Department record) {
        return departmentMapper.insertSelective(record);
    }

    @Override
    public Department selectByPrimaryKey(Integer departmentId) {
        return departmentMapper.selectByPrimaryKey(departmentId);
    }

    @Override
    public int updateByPrimaryKeySelective(Department record) {
        return departmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Department record) {
        return departmentMapper.updateByPrimaryKey(record);
    }
}
