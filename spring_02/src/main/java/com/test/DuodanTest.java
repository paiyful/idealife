package com.test;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DuodanTest {
    @Test
    public void singletonTest(){
        //单例
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService service = context.getBean("service", StudentService.class);
        StudentService service4 = context.getBean("service", StudentService.class);
        System.out.println(service4==service);//true
        service.SetStudentDao(new StudentDaoImpl());
        service.getStudent();

    }
    @Test
    public void prototypeTest(){
        //多例
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService service2 = context.getBean("service2", StudentService.class);
        StudentService service3 = context.getBean("service2", StudentService.class);
        System.out.println(service2==service3);//false
        service2.SetStudentDao(new StudentDaoImpl());
        service2.getStudent();
    }
}
