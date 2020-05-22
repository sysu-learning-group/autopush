package com.jason.autopush.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("chat_room")
public class ChatRoom implements Serializable {
    @TableId
    private Integer id;

    private String name;

    private String explain;

    private String icon;

    private Boolean isHot;

    /**
     * 房间类型
     */
    private Byte roomType;

    private Integer sort;

    /**
     * 是否记录聊天数据
     */
    private Boolean saveDb;

    /**
     * 是否禁言
     */
    private Boolean noSay;

    /**
     * 管理员列表 使用逗号隔开
     */
    private String admins;

    /**
     * 是否开启房间
     */
    private Boolean state;

    /**
     * 用户加入类型 0 游客可进 1不可进
     */
    private Boolean joinType;

    /**
     * 玩家等级限制
     */
    private Byte userLevel;

    /**
     * 代理等级限制
     */
    private Byte agentLevel;

    private static final long serialVersionUID = 1L;

    public ChatRoom(String name, String explain, Byte roomType) {
        this.name = name;
        this.explain = explain;
        this.roomType = roomType;
        this.joinType = true;
        this.noSay = false;
        this.icon = "/test.png";
        this.isHot = false;
        this.sort = 5;
        this.saveDb = false;
        this.state = true;
        this.userLevel = 0;
        this.agentLevel = 0;
    }
}
