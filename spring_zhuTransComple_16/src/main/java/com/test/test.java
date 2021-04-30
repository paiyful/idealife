package com.test;

import com.Service.AccountService;
import com.Service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountServiceImpl = context.getBean("accountService", AccountService.class);

        accountServiceImpl.transfer(1,2,2000);
    }
}
