package com.fc.test;

import com.fc.dao.EmployeeMapper;
import com.fc.pojo.Employee;
import com.fc.pojo.EmployeeExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class GenertorTest {
    @Test
    public void selectByPrimaryKey(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession();
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeExample employeeExample=new EmployeeExample();
            List<Employee> employees = mapper.selectByExample(employeeExample);
            for (Employee employee1 : employees) {
                System.out.println(employee1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
