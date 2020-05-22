package com.jason.autopush.mapper;


import com.jason.autopush.entity.ChatRoomMessage;

public interface ChatRoomMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChatRoomMessage record);

    int insertSelective(ChatRoomMessage record);

    ChatRoomMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatRoomMessage record);

    int updateByPrimaryKey(ChatRoomMessage record);
}