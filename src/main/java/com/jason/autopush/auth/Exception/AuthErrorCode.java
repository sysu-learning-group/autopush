package com.jason.autopush.auth.Exception;

import com.fasterxml.jackson.annotation.JsonValue;
import com.jason.autopush.common.ErrorCode;

public enum AuthErrorCode implements ErrorCode {


    /* http request error */
    OTHERS(ErrorCode.COMMON_OTHERS, "http request error"),
    AUTHENTICATION_ERROR(ErrorCode.AUTH_BASE+100, "authentication failure"),
    AUTHORIZATION_ERROR(ErrorCode.AUTH_BASE+200, "authorization failure"),

    NAMEEXIST(AUTH_BASE+106, "Username exists"),
    NAMENOTEXIST(AUTH_BASE+102, "Username does not exist"),
    EMAILEXIST(AUTH_BASE+101, "Email exists"),
    EMAILNOTEXIST(AUTH_BASE+103, "Email does not exist"),
    NAMEOREMAILNOTEXIST(AUTH_BASE+104, "Username or Email does not exist"),
    WRONGEMAILCODE(AUTH_BASE+105, "Wrong verification code"),
    LOGINTIMESEXCEEDED(AUTH_BASE+107, "Login times exceeded"),

    /* server errors */
    INTERNALSERVERERROR(ErrorCode.COMMON_SERVER_ERROR, "internal server error");


    private final int code;
    private final String reason;

    private AuthErrorCode(int value, String reasonPhrase) {
        this.code = value;
        this.reason = reasonPhrase;
    }

    public int value() {
        return this.code;
    }

    @JsonValue
    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return Integer.toString(this.code);
    }

    public String getReason() {
        return reason;
    }
}
