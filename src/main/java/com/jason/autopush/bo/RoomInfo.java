package com.jason.autopush.bo;

import com.jason.autopush.entity.ChatRoom;
import io.netty.channel.group.ChannelGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomInfo {
    private ChatRoom chatRoom;
    private ChannelGroup channelGroup;
}
