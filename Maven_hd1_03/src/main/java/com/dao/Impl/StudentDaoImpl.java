package com.dao.Impl;

import com.bean.Student;
import com.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
    //依赖注入
    @Autowired
    private Student student;

    public Student getStudent(){

    return student;
    }
}
