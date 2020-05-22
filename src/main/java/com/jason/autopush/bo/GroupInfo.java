package com.jason.autopush.bo;

import com.jason.autopush.entity.ChatGroup;
import io.netty.channel.group.ChannelGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupInfo {
    private ChatGroup group;
    private ChannelGroup channelGroup;
}
