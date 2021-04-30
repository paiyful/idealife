package com.Service.impl;

import com.Service.AccountService;
import com.dao.AccountDao;
import com.dao.inpl.AccoutDaoImpl;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED, readOnly = false)
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    @Override
    public void transfer(Integer form, Integer to, int money) {
        accountDao.decreaseMoney(money,form);

        System.out.println("发生异常");
        int i=1/0;

        accountDao.increaseMoney(money,to);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao=accountDao;
    }
}
