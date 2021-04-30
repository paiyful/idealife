package com.dao;

import com.bean.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
