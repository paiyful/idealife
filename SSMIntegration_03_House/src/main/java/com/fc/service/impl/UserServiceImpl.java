package com.fc.service.impl;

import com.fc.bean.User;
import com.fc.bean.UserExample;
import com.fc.dao.UserMapper;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
// 查询用户是否存在
    @Override
    public List<User> login(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andPasswordEqualTo(user.getPassword());
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andTypeEqualTo(user.getType());
        List<User> users = userMapper.selectByExample(userExample);

        return users;

    }
}
