package com.test;

import com.bean.User;
import com.dao.impl.JdbcTemplateImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void addUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcTemplateImpl jdbcTemplateDao = context.getBean("jdbcTemplateDao", JdbcTemplateImpl.class);

        jdbcTemplateDao.add("asd","1234");
    }

    @Test
    public void findAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplateImpl jdbcTemplateImpl = context.getBean("jdbcTemplateDao", JdbcTemplateImpl.class);
        jdbcTemplateImpl.findAll();

    }

    @Test
    public void findById(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplateImpl jdbcTemplateDao = context.getBean("jdbcTemplateDao", JdbcTemplateImpl.class);
        jdbcTemplateDao.findById(1);
    }

    @Test
    public void delete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplateImpl jdbcTemplateDao = context.getBean("jdbcTemplateDao", JdbcTemplateImpl.class);
        jdbcTemplateDao.deleteById(3);
    }

    @Test
    public void update(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplateImpl jdbcTemplateDao = context.getBean("jdbcTemplateDao", JdbcTemplateImpl.class);
        jdbcTemplateDao.updateById(new User("hao","12345"),1);
    }
}
