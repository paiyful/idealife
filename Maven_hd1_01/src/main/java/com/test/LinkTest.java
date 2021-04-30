package com.test;

import com.bean.Student;
import com.dao.StudentDao;
import com.util.MyBatisUtil;
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
    public void selectAll(){
        StudentDao mapper = MyBatisUtil.getMapper(StudentDao.class);
        List<Student> students = mapper.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void insertStudent(){
        StudentDao mapper = MyBatisUtil.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("针布搓");
        student.setSroce(12);
        int i = mapper.insertStudent(student);
        System.out.println(i);
    }
    @Test
    public void selectStudentByIds(){
        StudentDao mapper = MyBatisUtil.getMapper(StudentDao.class);
        List<Student> students = mapper.selectStudentByIds(1, 4, 7);

        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void updateStudentById(){
        StudentDao mapper = MyBatisUtil.getMapper(StudentDao.class);
        Student student = new Student();
        student.setId(10);
        student.setName("笑死");
        student.setSroce(10);
        int affactedRows = mapper.updateStudentById(student);
        System.out.println(affactedRows);

    }
    @Test
    public void testLevel2Cache(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis_config.xml");
            //二级缓存作用于sqlsession工厂类，sqlsession工厂长生的每一个sqlsession都有二级缓存
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            List<Student> students = mapper.selectAll();



            sqlSession.commit();
            List<Student> students1 = mapper.selectAll();

            List<Student> students2 = mapper.selectAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
