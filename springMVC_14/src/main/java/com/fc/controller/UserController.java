package com.fc.controller;

import com.fc.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//RestController是ResponseBody+Controller
@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping ("testRequest")
    public User testRequest(){
        return new User("张三","1234",12);
    }
}
