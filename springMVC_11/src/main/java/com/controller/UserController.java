package com.controller;

import com.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("" +
        "user")
public class UserController {
    @RequestMapping("test")
//    @ResponseBody注解防止视图解析器解析而报错
    @ResponseBody
    public User test(){
        return new User("张三",1);
    }
}
