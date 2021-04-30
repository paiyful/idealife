package com.test;

import com.bean.Company;
import com.bean.Employee;
import com.dao.CompanyDao;
import com.dao.EmployeeDao;
import com.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class ResultMapTest {
    @Test
    public void selectEmployeeByidAndName(){
        EmployeeDao mapper = MyBatisUtil.getMapper(EmployeeDao.class);
        List<Employee> employees = mapper.selectEmployeeByidAndName(1);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void selectCompanyById(){
        CompanyDao mapper = MyBatisUtil.getMapper(CompanyDao.class);
        Company company = mapper.selectCompanyById("小米");
        System.out.println(company);
    }
}
