package com.dao;

import com.bean.Phone;
import org.apache.ibatis.annotations.Param;

public interface PhoneDao {
    Phone selectPhoneById(@Param("pid") Integer pid);
}
