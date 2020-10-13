package com.aqzjkj.farmhouse.globalExceptionHandler;

public class ExceptionConstant {

    private ExceptionConstant() {

    }

    public enum ExceptionEnum {

        BUSINESS_EXCEPTION("BusinessException"),
        UN_KNOW_EXCEPTION("UnKnownException");

        private String exception;

        ExceptionEnum(String exception) {
            this.exception = exception;
        }

        public String getException() {
            return exception;
        }

        public static ExceptionEnum getExceptions(String exceptionName) {
            for (ExceptionEnum enums : ExceptionEnum.values())
                if (enums.getException().equals(exceptionName))
                    return enums;
            return null;
        }
    }
}