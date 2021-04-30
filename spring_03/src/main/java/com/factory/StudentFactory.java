package com.factory;

import com.dao.Impl.StudentDaoImpl;

public class StudentFactory {
    public StudentDaoImpl getStudentDaoImpl(){
        System.out.println("动态工厂！");
        return new StudentDaoImpl();
    }
}
