package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/login")
    public String add(){
        System.out.println("添加？！");
        return "/index.jsp";
    }
}
