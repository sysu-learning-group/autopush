package com.jason.autopush.common;

public class ClientRequestException extends IllegalArgumentException {

    private ErrorCode errorCode;
    private Object[] args;

    private String additionalInfo;

    public ClientRequestException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ClientRequestException(ErrorCode errorCode, String s, Object... args) {
        super(s);
        this.errorCode = errorCode;
    }

    public ClientRequestException(ErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public ClientRequestException(ErrorCode errorCode, Throwable cause, String additionalInfo) {
        super(cause);
        this.errorCode = errorCode;
    }

    public ClientRequestException(int errorCode, String message){
        super(message);
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public Object[] getArgs() {
        return this.args;
    }

}
