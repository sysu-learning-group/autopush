package com.jason.autopush.common;

import com.fasterxml.jackson.annotation.JsonValue;

public interface ErrorCode {


    public static final int COMMON_UNKNOWN = 100000;
    public static final int COMMON_SERVER_ERROR = 100001;
    public static final int COMMON_OTHERS = 100002;
    public static final int COMMON_INVALID_TOKEN = 100003;
    public static final int COMMON_UNAUTHRORIZED = 100004;



    public static final int ACCOUNT_BASE = 400000;

    public static final int AUTH_BASE = 500000;

    public static final int BROWSER_BASE = 600000;


    int value() ;

    @JsonValue
    int getCode() ;

}
