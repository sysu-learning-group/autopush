package com.jason.autopush.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("chat_user_group_relation")
public class ChatUserGroupRelation implements Serializable {
    @TableId
    private Integer id;

    private Integer uid;

    private Integer gid;

    private static final long serialVersionUID = 1L;
}
