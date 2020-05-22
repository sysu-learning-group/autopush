package com.jason.autopush.auth.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @TableId
    private Integer id;

    private Integer userid;

    private String username;

    private String role;

    public Role(Integer userid, String username, String role) {
        this.userid = userid;
        this.username = username;
        this.role = role;
    }
}