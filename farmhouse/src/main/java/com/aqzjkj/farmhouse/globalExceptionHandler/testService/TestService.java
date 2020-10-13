package com.aqzjkj.farmhouse.globalExceptionHandler.testService;

import com.aqzjkj.farmhouse.globalExceptionHandler.BaseService;
import com.aqzjkj.farmhouse.globalExceptionHandler.BusinessContstant;
import com.aqzjkj.farmhouse.globalExceptionHandler.BusinessException;
import com.aqzjkj.farmhouse.globalExceptionHandler.Response;
import org.springframework.stereotype.Service;

@Service
public class TestService extends BaseService {

    public Response tests(){
        throw new BusinessException(BusinessContstant.BusinessEnum.test);
    }
}