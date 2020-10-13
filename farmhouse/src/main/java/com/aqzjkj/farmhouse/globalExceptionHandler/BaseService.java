package com.aqzjkj.farmhouse.globalExceptionHandler;

import org.springframework.stereotype.Service;

@Service
public class BaseService {

    /**
     * 成功返回Response
     *
     * @param errorMsg  错误信息
     * @param errorCode 错误码
     * @param object    结果集
     * @return
     */
    public Response response(String errorCode, String errorMsg, Object object) {
        Response response = new Response();
        response.setCode(errorCode);
        response.setMessage(errorMsg);
        response.setResult(object);
        return response;
    }

    /**
     * 成功返回Response
     *
     * @param errorMsg  错误信息
     * @param errorCode 错误码
     * @return
     */
    public Response response(String errorCode, String errorMsg) {
        Response response = new Response();
        response.setCode(errorCode);
        response.setMessage(errorMsg);
        return response;
    }

    /**
     * 成功返回Response
     *
     * @param enums
     * @param object
     * @return
     */
    public Response response(SuccessContstant.SuccessEnum enums, Object object) {
        Response response = new Response();
        response.setCode(enums.getCode());
        response.setMessage(enums.getMessage());
        response.setResult(object);
        return response;
    }

    /**
     * 成功返回Response
     *
     * @param object 结果集
     * @return
     */
    public Response response(Object object) {
        Response response = new Response();
        response.setCode(SuccessContstant.SuccessEnum.SUCCESS_00.getCode());
        response.setMessage(SuccessContstant.SuccessEnum.SUCCESS_00.getMessage());
        response.setResult(object);
        return response;
    }


    /**
     * 成功返回Response
     *
     * @param enums
     * @return
     */
    public Response response(SuccessContstant.SuccessEnum enums) {
        Response response = new Response();
        response.setCode(enums.getCode());
        response.setMessage(enums.getMessage());
        return response;
    }

    /**
     * 错误返回Response
     *
     * @param enums
     * @param object
     * @return
     */
    public Response response(ErrorContstant.ErrorEnum enums, Object object) {
        Response response = new Response();
        response.setMessage(enums.getErrorMsg());
        response.setCode(enums.getErrorCode());
        response.setResult(object);
        return response;
    }

    /**
     * 错误返回Response
     *
     * @param enums
     * @return
     */
    public Response response(ErrorContstant.ErrorEnum enums) {
        Response response = new Response();
        response.setMessage(enums.getErrorMsg());
        response.setCode(enums.getErrorCode());
        return response;
    }
}