package com.dao;

import com.bean.Student;

public class StudentDaoImpl implements StudentDao{
    @Override
    public Student getStudent() {
        System.out.println("获取到学生");
        return new Student(1,"asd","1234");
    }
}
