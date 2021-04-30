package com.dao.impl;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {

    @Override
    public void init() {
        System.out.println("初始化");
    }

    @Override
    public void destory() {
        System.out.println("销毁");
    }

    @Override
    public void addStudent() {
        System.out.println("添加学生！");
    }


}
