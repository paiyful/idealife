package com.test;

import com.dao.JdbcTempleDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTempleTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTempleDaoImpl jdbcTempleDao = context.getBean("jdbcTempleDao", JdbcTempleDaoImpl.class);
        jdbcTempleDao.findAll();
    }
}
