package com.dao;

import com.bean.Company;
import com.bean.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeDao {
    Employee selectEmployeeByidAndName(@Param("eid") Integer id, @Param("ename") String name);
}
