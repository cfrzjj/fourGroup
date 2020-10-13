package com.aqzjkj.farmhouse.globalExceptionHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private BaseService baseService;

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Response result(Exception e) {
        ExceptionConstant.ExceptionEnum enums = ExceptionConstant.ExceptionEnum.getExceptions(e.getClass().getSimpleName());
        if (null == enums) {
            UnKnownException unKnownException = new UnKnownException(ErrorContstant.ErrorEnum.UN_KNOW_ERROR);
            return baseService.response(unKnownException.getCode(), unKnownException.getMessage());
        }
        //新增异常需要在这里统一声明
        switch (enums) {
            case BUSINESS_EXCEPTION:
                return baseService.response(((BusinessException) e).getCode(), e.getMessage());
            case UN_KNOW_EXCEPTION:
                return baseService.response(((UnKnownException) e).getCode(), e.getMessage());
        }
        UnKnownException unKnownException = new UnKnownException(ErrorContstant.ErrorEnum.UN_KNOW_ERROR);
        return baseService.response(unKnownException.getCode(), unKnownException.getMessage());
    }
}