package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/test")
    public String test(String username,String password){
        System.out.println(username+""+password);
        return "/login.jsp";
    }
}
