package com.service.impl;

import com.bean.Student;
import com.dao.Impl.StudentDaoImpl;
import com.dao.StudentDao;
import com.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentServiceImpl implements studentService {
    @Autowired
    private StudentDao studentdao;

    public Student getStudent(){
    return studentdao.getStudent();
    }
}
