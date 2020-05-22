package com.jason.autopush.mapper;


import com.jason.autopush.entity.ChatGroupMessage;

public interface ChatGroupMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChatGroupMessage record);

    int insertSelective(ChatGroupMessage record);

    ChatGroupMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatGroupMessage record);

    int updateByPrimaryKey(ChatGroupMessage record);
}