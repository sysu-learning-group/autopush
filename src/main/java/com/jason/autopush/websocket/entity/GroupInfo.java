package com.jason.autopush.websocket.entity;

public class GroupInfo {
    private ChatGroupDo group;
    private ChannelGroup channelGroup;

    public GroupInfo(ChatGroupDo group, ChannelGroup channelGroup) {
        this.group = group;
        this.channelGroup = channelGroup;
    }

}
