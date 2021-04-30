package com.test;

import com.bean.Company;
import com.bean.Employee;
import com.dao.CompanyDao;
import com.dao.EmployeeDao;
import com.util.MyBatisUtil;
import org.junit.Test;

public class ResultMapTest {
    @Test
    public void selectEmployeeByidAndName(){
        EmployeeDao mapper = MyBatisUtil.getMapper(EmployeeDao.class);
        Employee employee = mapper.selectEmployeeByidAndName(1, "张三");
        System.out.println(employee);
    }
    @Test
    public void selectCompanyById(){
        CompanyDao mapper = MyBatisUtil.getMapper(CompanyDao.class);
        Company company = mapper.selectCompanyById(1);
        System.out.println(company);
    }
}
