package com.add;

import java.util.List;

public interface StudentDao {
    Student findId(Integer id);
    List<Student> findAll();
}
