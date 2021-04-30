package com.test;

import com.bean.Student;
import com.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

public class LinkTest {

    @Test
    public void insertStudent(){
        SqlSession sqlSession = null;
        try {
            //加载配置
            Reader resourceAsReader = Resources.getResourceAsReader("MyBatis_config.xml");
            //获取会话工厂
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsReader);
            //获取会话
            sqlSession= build.openSession();

            System.out.println(sqlSession);
            //获取接口
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            System.out.println(mapper);
            //sql语句
            int i = mapper.StudentAdd(new Student(2, "李四", 99, "男", "dsa"));
            //提交
            System.out.println(i);

            sqlSession.commit();

            System.out.println("添加成功！");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
    @Test
    public void selectStudent(){
        SqlSession sqlSession=null;
        try {
            //配置内置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession();
            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
            List<Student> students = studentDao.selectAll();
            for (Student student : students) {
                System.out.println(student.getId());
                System.out.println(student.getGender());
                System.out.println(student.getName());
                System.out.println(student.getInfo());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void SelectOnes(){
        SqlSession sqlSession=null;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);

            List<Student> students = mapper.SelectOnes(2);

            for (Student student : students) {
                System.out.println(student.getId());
                System.out.println(student.getGender());
                System.out.println(student.getName());
                System.out.println(student.getInfo());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
