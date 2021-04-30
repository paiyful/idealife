package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//value和path可以写路径
//method可以写POST或者是GET提交，可以不写，通过from表单进行自动识别，或者写的跟from表单的值一样
//params 可以获取里面的值
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public String login(){
        System.out.println("登陆成功！");
        return "/index.jsp";
    }
}
