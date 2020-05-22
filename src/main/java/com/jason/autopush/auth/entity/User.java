package com.jason.autopush.auth.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@TableName("ums_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {
    @TableId
    private Integer id;

    private String username;

    private String password;

    private String authority;

    private String avatar;

    private Byte userLevel;

    private Byte userType;

    private boolean isDelete;

    private String email;

    private String qq;

    private String tel;

    private String wechat;

    private Date createTime;

    private Date modifiedTime;

    public User() {
        this.avatar = "/test.png";
        this.userLevel = 1;
        this.userType = 1;
        this.isDelete = false;
        Date date = new Date();
        this.createTime = date;
        this.modifiedTime = date;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<>();
        String authority = getAuthority();
        String[] userRoles = authority.split(",");

        for (String userRole : userRoles) {
            SimpleGrantedAuthority role = new SimpleGrantedAuthority("ROLE_" + userRole);
            auths.add(role);
        }
        return auths;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}