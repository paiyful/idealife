package com.test;

import com.bean.User;
import com.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = context.getBean("userController", UserController.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);
        List<User> all = userController.findAll();
        System.out.println(all);
    }
}
