package com.fc.Service.impl;

import com.fc.Service.AccountService;
import com.fc.dao.AccountDao;
import com.fc.dao.inpl.AccoutDaoImpl;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    @Override
    public void transfer(Integer form, Integer to, int money) {
        accountDao.decreaseMoney(money,form);

        System.out.println("发生了异常");
        int num=1/0;

        accountDao.increaseMoney(money,to);
    }

    public void setAccountDao(AccoutDaoImpl accountDao) {
    }
}
