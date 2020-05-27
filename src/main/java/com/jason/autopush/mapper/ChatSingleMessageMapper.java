package com.jason.autopush.mapper;

import com.jason.autopush.entity.ChatSingleMessage;

public interface ChatSingleMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChatSingleMessage record);

    int insertSelective(ChatSingleMessage record);

    ChatSingleMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatSingleMessage record);

    int updateByPrimaryKey(ChatSingleMessage record);
}