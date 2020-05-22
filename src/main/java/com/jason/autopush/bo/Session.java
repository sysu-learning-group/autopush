package com.jason.autopush.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    private Integer userId;
    private String username;
    private String avatar;
    /**
     * token
     * 用户验证用户的token是否过期
     */
    private String token;
}
