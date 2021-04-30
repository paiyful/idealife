package com.dao;

import com.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> selectAll();

    User selectUserById(@Param("uid") Integer id);

}
