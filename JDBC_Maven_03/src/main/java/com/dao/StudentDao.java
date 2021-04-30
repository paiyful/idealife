package com.dao;

import com.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StudentDao {
//    删除
    int deteleStudent(@Param("id") Integer id);
//    增加
    int studentAdd(Student student);
//    更新信息
    int studentUpdate(Student student);
//     查询表
    List<Student> studentSelect();
//      按照id和姓名查询
    Student studentSelectByIdAndByName(@Param("id") Integer id,@Param("name") String name);

    int studentAddGner(Student student);
}
