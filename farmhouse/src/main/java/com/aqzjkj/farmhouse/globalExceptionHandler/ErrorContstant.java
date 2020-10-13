package com.aqzjkj.farmhouse.globalExceptionHandler;

public class ErrorContstant {

    private ErrorContstant(){

    }

    public enum ErrorEnum {

        UN_KNOW_ERROR("0001", "未知异常");

        private String errorCode;
        private String errorMsg;

        ErrorEnum(String errorCode, String errorMsg) {
            this.errorCode = errorCode;
            this.errorMsg = errorMsg;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }
    }
}