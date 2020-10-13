package com.aqzjkj.farmhouse.globalExceptionHandler;

public class BusinessException extends RuntimeException {

    private boolean success;

    private Object result;

    private String code;

    private String message;

    public BusinessException(BusinessContstant.BusinessEnum businessEnum) {
        this.code = businessEnum.getCode();
        this.message = businessEnum.getMessage();
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