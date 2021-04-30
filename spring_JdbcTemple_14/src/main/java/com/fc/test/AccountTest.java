package com.fc.test;

import com.fc.Service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class AccountTest {
    @Test
    public void testTransfer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountServiceImpl accountService = context.getBean("accountService", AccountServiceImpl.class);
        accountService.transfer(1,2, 100);
    }
}
