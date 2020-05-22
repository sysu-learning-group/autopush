package com.jason.autopush.entity;

import com.jason.autopush.bo.Session;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatRoomMessage implements Serializable {
    private Integer id;

    private Integer roomId;

    private Integer fromUserId;

    private String content;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public ChatRoomMessage(Integer roomId, String content, Session session, Date time) {
        this.roomId = roomId;
        this.content = content;
        this.fromUserId = session.getUserId();
        this.createTime = time;
    }
}
