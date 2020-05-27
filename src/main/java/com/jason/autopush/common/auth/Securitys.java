package com.jason.autopush.common.auth;

public class Securitys {

    public static final String SUPPORT_EL = "hasRole('SUPPORT')"; // 需要客户支持权限

    public static final String ADMIN_EL = "hasRole('ADMIN')"; // 需要管理员权限

    public static final String SERVER_ONLY_EL = "#oauth2.hasScope('server')"; // 仅限后端调用

    public static final String ROOT_EL = "hasRole('ROOT')"; // ROOT 用户

}
