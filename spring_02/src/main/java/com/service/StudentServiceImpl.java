package com.service;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentServiceImpl implements StudentService{
    private StudentDao studentDao;

    public void SetStudentDao(StudentDao studentDao){
        this.studentDao =studentDao;
    }


    @Override
    public Student getStudent() {
        return studentDao.getStudent();
    }
}
