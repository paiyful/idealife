package com.test;

import com.dao.impl.StudentDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void Studenttest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object studentDaoImpl = context.getBean("studentDaoImpl");
        System.out.println(studentDaoImpl);
    }
}
