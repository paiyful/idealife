package com.dao;

import com.bean.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTempleDaoImpl {
    private JdbcTemplate jdbcTemplate;


    public void findAll(){
        //sql语句
        String sql="select * from User";
        //查询语句
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        //遍历query
        for (User user : query) {
            System.out.println(user);
        }
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
