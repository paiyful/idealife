package com.test;

import com.bean.Student;
import com.dao.StudentDao;
import com.github.pagehelper.PageHelper;
import com.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class LinkTest {
    @Test
    public void selectAll(){
        StudentDao mapper = MyBatisUtil.getMapper(StudentDao.class);
        PageHelper.startPage(1,5);
        List<Student> students = mapper.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
        MyBatisUtil.commit();
    }
}
