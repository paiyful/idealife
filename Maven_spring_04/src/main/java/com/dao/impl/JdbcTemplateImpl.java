package com.dao.impl;

import com.bean.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTemplateImpl{
    private JdbcTemplate jdbcTemplate;

    public void add(String username,String password){

        int affactedRows=jdbcTemplate.update("insert into user(username,password) values(?,?)",username,password);

        System.out.println("受影响行数"+affactedRows);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate=jdbcTemplate;
    }

    public void findAll(){
        String sql="select * from user";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        for (User user : query) {
            System.out.println(user);
        }
    }

    public void findById(Integer id){
        String sql="select * from user where id=?";

        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class), id);
        for (User user : query) {
            System.out.println(user);
        }
    }

    public void deleteById(Integer id){
        String sql="delete from user where id=?";
        //调用update方法执行删除sql语句
        int affectedRows = jdbcTemplate.update(sql, id);
        System.out.println("受影响行数"+affectedRows);

    }

    public void updateById(User user,Integer id){
        String sql="update user set username=? ,password=? where id=?";
        int affectedRows = jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), id);
        System.out.println("受影响行数"+affectedRows);
    }
}
