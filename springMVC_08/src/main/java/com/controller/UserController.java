package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("testStatic")
    public String testStatic(){
        System.out.println("静态资源已放行！");
        return "login";
    }
}