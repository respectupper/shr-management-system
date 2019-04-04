package com.zjl.shrmanagementsystem.dao;

import com.zjl.shrmanagementsystem.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(String phone,String password);

    int checkPhone(String phone);
}