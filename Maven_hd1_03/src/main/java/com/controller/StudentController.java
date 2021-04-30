package com.controller;

import com.bean.Student;
import com.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController{
    @Autowired
    private studentService studentService;

    public Student getStudent(){
        return studentService.getStudent();
    }

}
