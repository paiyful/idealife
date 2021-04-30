package com.dao.impl;

import com.dao.StudentDao;

public class StudentImpl implements StudentDao {

    @Override
    public void study() {
        System.out.println("好好学习，天天向上");
    }

    @Override
    public void sleep() {
        System.out.println("要睡觉了");
    }
}
