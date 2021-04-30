package com.fc.controller;

import com.fc.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@ResponseBody
//使用注解进行全局的异常处理
public class AdivceMyHandlerExceptionResolver {
    @ExceptionHandler(MyException.class)
    public Map<String,Object> resolveMyException(MyException Me){
        Map<String, Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("message",Me.getMessage());
        return map;
    }
    @ExceptionHandler(RuntimeException.class)
    public Map<String,Object> testSystemException(RuntimeException e){
        Map<String, Object> map = new HashMap<>();
        System.out.println("系统异常被处理");;
        map.put("code",40000);
        map.put("message",e.getMessage());
        return map;
    }
}
