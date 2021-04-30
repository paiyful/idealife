package com.dao;

import com.bean.Student;

import java.util.List;


public interface StudentDao {
    //查询全部
    List<Student> selectAll();

    int insertStudent(Student student);
    //Intger... 是一个可变长参数，是一个数组，如果写数值只能在他的前面写，不能在他后面写
    List<Student> selectStudentByIds(Integer... ids);

    int updateStudentById(Student student);
}
