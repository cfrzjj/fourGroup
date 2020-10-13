package com.aqzjkj.farmhouse.globalExceptionHandler;

import com.google.common.base.Objects;

import java.io.Serializable;

public class Response implements Serializable {
    private static final long serialVersionUID = 6950327877975282433L;
private boolean success;private Object result;private String code;private String message;

    public Response() {
    }

    public Response(Object result) {
        this.success = true;
        this.result = result;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }public Response(String code) {
        this.success = false;
        this.code = code;
    }

    public Response(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        success = true;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.success = false;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Response response = (Response) o;
        if (success != response.success) {
            return false;
        }
        if (!code.equals(response.code)) {
            return false;
        }
        if (!result.equals(response.result)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result1 = (success ? 1 : 0);
        result1 = 31 * result1 + result.hashCode();
        result1 = 31 * result1 + code.hashCode();
        return result1;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("success", success).add("result", result).add("code", code)
                .add("message", message).omitNullValues().toString();
    }
}