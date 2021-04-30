package com.dao.Impl;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentDaoImpl implements StudentDao{

    @Override
    public Student getStudent() {
        System.out.println("针布搓！");
        return new Student();
    }
}
