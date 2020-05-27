package com.jason.autopush.mapper;

import com.jason.autopush.entity.ChatGroup;

public interface ChatGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChatGroup record);

    int insertSelective(ChatGroup record);

    ChatGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatGroup record);

    int updateByPrimaryKey(ChatGroup record);
}