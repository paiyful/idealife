package com.dao;

import com.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
    List<Employee> selectEmployeeByidAndName(@Param("cid") Integer id);
}
