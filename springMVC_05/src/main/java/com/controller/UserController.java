package com.controller;

import com.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("testObjectAndObject")
    public String testObjectAndObject(User user){
        System.out.println(user);
        return "/login.jsp";
    }
}
