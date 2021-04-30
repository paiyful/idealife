package com.test;

import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        //创建Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //创建bean类
        UserService service = context.getBean("service", UserService.class);
        //调用增强方法
        service.add();
        //调用正常方法
        service.delete();
    }
}
