package com.jason.autopush.auth.dao.mapper;

import com.jason.autopush.auth.entity.User;

public interface UserMapper {
    boolean isUsernameExist(String username);

    User selectByUsername(String username);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}