package com.controller;

import com.bean.User;
import com.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController{
    @Autowired
    private Userservice userservice;

    public User getUser(){
        return userservice.getUser();
    }
}
