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
    public void deteleStudent() {
        SqlSession sqlSession = null;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession();
            System.out.println(sqlSession);
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            int i = mapper.deteleStudent(2);
            System.out.println(i);
            sqlSession.commit();
            System.out.println("删除成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void studentAdd() {
        SqlSession sqlSession = null;
        try {
            //配置内置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis_config.xml");
            //获取会话工厂
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获取会话
            sqlSession = build.openSession();
            //获取连接
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            //执行sql语句
            int i = mapper.studentAdd(new Student(5, "卢老卢", 100, "男", "给我卢老卢一个面子"));
            System.out.println(i);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }

    @Test
    public void studentUpdate() {
        SqlSession sqlSession = null;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            int i = mapper.studentUpdate(new Student(3, "秦老卢", 100, "男", "给我秦老卢一个面子"));
            System.out.println(i);
            sqlSession.commit();
            System.out.println("修改成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }

    @Test
    public void studentSelect() {
        SqlSession sqlSession = null;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            List<Student> students = mapper.studentSelect();
            for (Student student : students) {
                System.out.print(student.getId());
                System.out.print(student.getName());
                System.out.print(student.getGender());
                System.out.println(student.getsroce());
                System.out.print(student.getInfo());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void studentSelectByIdAndByName() {
        SqlSession sqlSession = null;
        try {
            // 读取配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis_config.xml");
            // 获取SqlSession工厂对象
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            // 获取SqlSession对象
            sqlSession = build.openSession();
            // 通过SqlSession获取接口的代理对象
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            // 调用接口中的方法
            Student student1 = mapper.studentSelectByIdAndByName(2, "赵老卢");
            // 关闭资源
            System.out.println(student1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
    @Test
    public void studentAddGner(){
        SqlSession sqlSession = null;
        try {
            //配置内置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis_config.xml");
            //获取会话工厂
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获取会话
            sqlSession = build.openSession();
            //获取连接
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            //执行sql语句
            Student student= new Student();
            student.setName("oy");
            student.setGender("男");
            student.setsroce(99);
            student.setInfo("不");
            int i = mapper.studentAddGner(student);
            System.out.println(i);
            System.out.println(student.getId());
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
