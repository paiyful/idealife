package com.test;

import com.bean.Manager;
import com.dao.ManagerDao;
import com.util.SqlsessionUtil;
import org.junit.Test;

public class OrmTest {
    @Test
    public void selectManagerById(){
        //获取实现类对象
        ManagerDao mapper = SqlsessionUtil.getMapper(ManagerDao.class);
        //执行对应方法
        Manager manager = mapper.selectManagerById(1);
        //提交事务
        SqlsessionUtil.commit();
        //输出结果
        System.out.println(manager);
    }
}
