package com.service.impl;

import com.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("1");
    }

    @Override
    public void delete() {
        System.out.println("2");
    }
}
