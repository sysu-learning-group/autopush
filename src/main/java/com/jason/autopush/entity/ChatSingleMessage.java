package com.jason.autopush.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("chat_single_message")
public class ChatSingleMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private Integer id;

    private Integer fromUserId;

    private Integer toUserId;

    private String content;

    private Date createTime;

    public ChatSingleMessage(Integer fromUserId, Integer toUserId, String content, Date createTime) {
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.content = content;
        this.createTime = createTime;
    }
}
