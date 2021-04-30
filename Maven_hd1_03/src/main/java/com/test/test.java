package com.test;

import com.bean.Student;
import com.controller.StudentController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentController = (StudentController) classPathXmlApplicationContext.getBean("studentController");
        Student student = studentController.getStudent();
        System.out.println(student);
    }
}
