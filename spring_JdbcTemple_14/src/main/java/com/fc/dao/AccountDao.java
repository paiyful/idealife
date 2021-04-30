package com.fc.dao;

import java.math.BigDecimal;

public interface AccountDao {
    //价钱方法
    void increaseMoney(Integer money,Integer id);
    //减少方法
    void decreaseMoney(Integer money,Integer id);
}
