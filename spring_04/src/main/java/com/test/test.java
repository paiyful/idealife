package com.test;

import com.bean.Student;
import com.dao.StudentDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void StudentTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        studentDao.addStudent();
        ((ClassPathXmlApplicationContext)context).close();
    }
}
