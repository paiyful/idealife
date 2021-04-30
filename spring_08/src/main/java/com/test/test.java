package com.test;

import com.dao.StudentDao;
import com.dao.impl.StudentImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
public class test {
    @Test
    public void test(){
        //创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao student = context.getBean("studentImpl", StudentDao.class);
        //调用增强的方法
        student.study();
        //调用正常的方法
        student.sleep();
    }
}
