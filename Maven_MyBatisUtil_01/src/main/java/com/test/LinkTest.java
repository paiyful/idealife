package com.test;

import com.bean.Phone;
import com.bean.User;
import com.dao.PhoneDao;
import com.dao.UserDao;
import com.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class LinkTest {
    @Test
    public void selectAll(){
        UserDao mapper = MyBatisUtil.getMapper(UserDao.class);
        List<User> users = mapper.selectAll();
        System.out.println(users);
    }
    @Test
    public void selectPhoneById(){
        PhoneDao mapper = MyBatisUtil.getMapper(PhoneDao.class);
        Phone phone = mapper.selectPhoneById(1);
        System.out.println(phone);
    }
    @Test
    public void selectUserById(){
        UserDao mapper = MyBatisUtil.getMapper(UserDao.class);
        User user = mapper.selectUserById(1);
        System.out.println(user);
    }
}
