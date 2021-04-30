package com.Service;

public interface AccountService {
    /**
     *钱转哪去
     *转给谁
     *业务层就是处理业务的
     */
    void transfer(Integer form, Integer to, int money);

}
