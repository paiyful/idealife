package com.test;

import com.bean.Student;
import com.dao.StudentDao;
import com.util.SqlsessionUtil;
import org.junit.Test;

import java.util.List;

public class UtilTest {
    @Test
    public void testSelectAllStudent(){
        try{
            //通过工具类获取接口实现类对象
            StudentDao mapper = SqlsessionUtil.getMapper(StudentDao.class);
            //执行方法
            List<Student> students = mapper.studentSelect();
            //提交事务
            SqlsessionUtil.commit();
            //遍历students
            for (Student student : students) {
                System.out.println(student);
            }
        }catch (Exception e){
            SqlsessionUtil.rollback();
            e.printStackTrace();
        }


    }
}
