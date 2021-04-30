package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class InterceptorController {
    @RequestMapping("testInterceptor")
    public void testInterceptor(){
        System.out.println("测试拦截器！！！！");
    }
}
