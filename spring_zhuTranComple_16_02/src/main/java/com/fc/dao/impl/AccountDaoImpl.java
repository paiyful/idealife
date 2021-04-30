package com.fc.dao.impl;

import com.fc.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void add(Integer money,Integer id) {
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
        String sql="update account set money=money+? where id=?";
        int affectRows = jdbcTemplate.update(sql, money, id);
        System.out.println("受影响的行数为："+affectRows);
    }

    @Override
    public void jian(Integer money,Integer id) {
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
        String sql="update account set money=money-? where id=?";
        int affectRows = jdbcTemplate.update(sql, money, id);
        System.out.println("受影响的行数为："+affectRows);
    }
}
