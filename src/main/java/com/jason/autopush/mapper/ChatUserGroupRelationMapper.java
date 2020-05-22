package com.jason.autopush.mapper;


import com.jason.autopush.entity.ChatUserGroupRelation;

public interface ChatUserGroupRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChatUserGroupRelation record);

    int insertSelective(ChatUserGroupRelation record);

    ChatUserGroupRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatUserGroupRelation record);

    int updateByPrimaryKey(ChatUserGroupRelation record);
}