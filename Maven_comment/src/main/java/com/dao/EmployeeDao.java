package com.dao;

import com.bean.Employee;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeDao {
    @Select("select * from employee")
    List<Employee> findEmployeeAll();
}
