package com.dao;

import com.bean.Student;

import java.util.List;


public interface StudentDao {
    //添加学生id，姓名，成绩
    int StudentAdd(Student student);

    List<Student> selectAll();

    List<Student> SelectOnes(Integer id);
}
