package com.test;

import com.bean.ComplexType;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComplexType type = context.getBean("complexType", ComplexType.class);
        System.out.println(type);
    }
}
