package com.jason.autopush.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGroup implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String groupName;

    private String icon;

    private String description;
    /**
     * 群类型
     */
    private Byte type;

    /**
     * 加群人数最大值
     */
    private Short maxNumberOfPeople;

    /**
     * 是否保存数据到数据库
     */
    private Boolean saveDb;

    private Date createTime;

    private Date modifiedTime;
}