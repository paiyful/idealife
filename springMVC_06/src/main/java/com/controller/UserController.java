package com.controller;


import com.bean.Clazz;
import com.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("testListAndMap")
    public String testListAndMap(Clazz clazz){
        System.out.println(clazz);
        return "/login.jsp";
    }
}
