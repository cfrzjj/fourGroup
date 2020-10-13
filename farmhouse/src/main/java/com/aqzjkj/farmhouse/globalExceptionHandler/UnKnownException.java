package com.aqzjkj.farmhouse.globalExceptionHandler;

public class UnKnownException extends RuntimeException {

    private boolean success;

    private Object result;

    private String code;

    private String message;

    public UnKnownException(ErrorContstant.ErrorEnum errorEnum) {
        this.code = errorEnum.getErrorCode();
        this.message = errorEnum.getErrorMsg();
        this.success = false;
        this.result = null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}