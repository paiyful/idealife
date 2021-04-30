package com.dao.impl;

import com.bean.User;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private User user;

    @Override
    public User getUser() {
        System.out.println("住在山里针布搓！！！！");
        return user;
    }
}
