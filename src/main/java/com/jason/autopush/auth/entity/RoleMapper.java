package com.jason.autopush.auth.entity;

import com.jason.autopush.auth.entity.Role;

public interface RoleMapper {

    Role selectByUserId(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}