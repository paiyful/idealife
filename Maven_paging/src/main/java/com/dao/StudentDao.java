package com.dao;

import com.bean.Student;

import java.util.List;


public interface StudentDao {
    //查询全部
    List<Student> selectAll();

}
