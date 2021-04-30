package com.test;

import com.bean.Employee;
import com.dao.EmployeeDao;
import com.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class ResultMapTest {
    @Test
    public void findEmployeeAll(){
        EmployeeDao mapper = MyBatisUtil.getMapper(EmployeeDao.class);
        List<Employee> all = mapper.findEmployeeAll();
        System.out.println(all);
    }
}
