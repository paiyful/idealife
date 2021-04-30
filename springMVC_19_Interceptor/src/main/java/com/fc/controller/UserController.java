package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("testInterceptor")
    public void testInterceptor(){
        System.out.println("非拦截!!!");
    }
}
