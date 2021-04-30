package com.Controller;

import com.bean.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class Controller {
    private StudentService studentService=new StudentServiceImpl();

    public Student getStudent(){

        return studentService.getStudent();
    }
}
