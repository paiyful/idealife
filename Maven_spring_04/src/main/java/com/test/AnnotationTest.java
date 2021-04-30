package com.test;

import com.bean.User;
import com.config.JdbcConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AnnotationTest {
    @Test
    public void testAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfiguration.class);
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="select * from user";
        List<User> query = template.query(sql, new BeanPropertyRowMapper<>(User.class));
        for (User user : query) {
            System.out.println(user);
        }

    }
}
