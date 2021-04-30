package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class test {
    @Test
    public void jdbcTest(){
        //通过注解获取spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext("JdbcConfiguration.class");
        //
        JdbcTemplate jdbcConfiguration = context.getBean("JdbcConfiguration", JdbcTemplate.class);

        String sql="select * from account";
        jdbcConfiguration.query(sql,new BeanPropertyRowMapper<>(JdbcTemplate.class));

    }
}
