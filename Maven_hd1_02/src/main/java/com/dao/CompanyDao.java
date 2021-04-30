package com.dao;

import com.bean.Company;
import org.apache.ibatis.annotations.Param;

public interface CompanyDao {
     Company selectCompanyById(@Param("cid") Integer id);
}
