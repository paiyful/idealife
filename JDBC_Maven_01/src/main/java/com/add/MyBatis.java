package com.add;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatis {
    @Test

    public void test(){
        SqlSession sqlSession=null;
        //以下代码：固定格式，不要问
        //1.加载配置文件

        try {

//        Reader resourceAsReader = Resources.getResourceAsReader("myBatis_config.xml");
            InputStream resourceAsStream = Resources.getResourceAsStream("myBatis_config.xml");
            //2,获取会话工厂
            SqlSessionFactory Factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //3.从工厂里获取SqlSession，相当与jdbc中的Conection
             sqlSession= Factory.openSession();

            System.out.println(String.valueOf(sqlSession));
            //4.获取实现类对象
            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
            //5.执行sql语句

//            Student student=studentDao.findId(1);
//
//            System.out.println(student.getAge());
//            System.out.println(student.getBrithday());
//            System.out.println(student.getUname());

            List<Student> list =studentDao.findAll();
            for (Student student1: list
                 ) {
                    System.out.println(student1.getAge());
                    System.out.println(student1.getBrithday());
                    System.out.println(student1.getUname());
            }

            sqlSession.commit();




        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }


    }


}
