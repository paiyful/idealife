package com.fc.dao.inpl;

import com.fc.bean.Account;
import com.fc.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.math.BigDecimal;

public class AccoutDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void increaseMoney(Integer money, Integer id) {
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
        String sql="update account set money=money+? where id=?";
        int affectRows = jdbcTemplate.update(sql, money, id);
        System.out.println("受影响的行数："+affectRows);
    }

    @Override
    public void decreaseMoney(Integer money, Integer id) {
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
        String sql="update account set money=money-? where id=?";
        int affcetRows = jdbcTemplate.update(sql, money, id);
        System.out.println("受影响行数："+affcetRows);
    }
}
