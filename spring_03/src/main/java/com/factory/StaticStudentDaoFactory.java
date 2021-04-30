package com.factory;

import com.dao.Impl.StudentDaoImpl;

public class StaticStudentDaoFactory {
    public static StudentDaoImpl getStudentDaoImpl(){
        System.out.println("静态工厂！");
        return new StudentDaoImpl();
    }
}
