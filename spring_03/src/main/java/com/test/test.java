package com.test;

import com.factory.StaticStudentDaoFactory;
import com.factory.StudentFactory;
import org.junit.Test;

public class test {
    @Test
    public void StudentFactoryTest(){
        //静态工厂！
        StaticStudentDaoFactory factory = new StaticStudentDaoFactory();
        //动态工厂！
        StudentFactory factory1 = new StudentFactory();
        factory1.getStudentDaoImpl();
    }
}
