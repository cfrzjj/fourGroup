package com.aqzjkj.farmhouse.globalExceptionHandler.testController;

import com.aqzjkj.farmhouse.globalExceptionHandler.Response;
import com.aqzjkj.farmhouse.globalExceptionHandler.testService.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;
    
//    @PostMapping("/test")
    @RequestMapping("/test")
    public Response test() {
        try {
            return testService.tests();
        } catch (Exception e) {
//            log.error("请求出现异常:{}", e);
            throw e;
        }
    }
}