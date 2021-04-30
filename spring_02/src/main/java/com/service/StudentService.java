package com.service;

import com.bean.Student;
import com.dao.StudentDao;

public interface StudentService {
    Student getStudent();
    void SetStudentDao(StudentDao studentDao);
}
