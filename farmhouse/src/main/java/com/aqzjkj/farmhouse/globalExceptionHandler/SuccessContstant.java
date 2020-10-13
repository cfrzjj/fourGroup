package com.aqzjkj.farmhouse.globalExceptionHandler;

public class SuccessContstant {

    private SuccessContstant(){

    }

    public enum SuccessEnum {

        SUCCESS_00("0000", "成功");

        private String code;
        private String message;

        SuccessEnum(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}