package com.test;

import com.Controller.Controller;
import com.dao.StudentDaoImpl;
import com.service.StudentService;
import com.service.StudentServiceImpl;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        StudentService studentService = new StudentServiceImpl();
        studentService.SetStudentDao(new StudentDaoImpl());
        studentService.getStudent();
    }
}
