package com.Service.impl;

import com.Service.AccountService;
import com.dao.AccountDao;
import org.springframework.stereotype.Service;

@Service
public class AccountImpl implements AccountService {

    private AccountDao accountDao;

    @Override
    public void transfer(Integer form, Integer to, int money) {

    }
}
