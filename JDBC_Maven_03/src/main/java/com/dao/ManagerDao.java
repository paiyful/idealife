package com.dao;

import com.bean.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerDao {
    //根据id查找信息
    Manager selectManagerById(@Param("mgrid") Integer mgrid);
}
