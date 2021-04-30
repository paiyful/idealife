package com.fc.controler;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/login")
    public String login(){
        System.out.println("登陆成功了！");

        return "/index.jsp";
    }
}
