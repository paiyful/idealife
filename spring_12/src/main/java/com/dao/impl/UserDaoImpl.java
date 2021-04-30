package com.dao.impl;

import com.bean.User;
import com.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> findAll() {

        List<User> list= new ArrayList<>();
        list.add(new User("张三",1));
        list.add(new User("李四",2));
        list.add(new User("王五",3));
        list.add(new User("赵六",4));
        return list;
    }
}
