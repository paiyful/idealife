package com.fc.bean;


import org.springframework.stereotype.Component;

@Component
public class Zulist extends ZulistKey {
    private Integer userlistId;

    private Integer contractId;

    public Integer getUserlistId() {
        return userlistId;
    }

    public void setUserlistId(Integer userlistId) {
        this.userlistId = userlistId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }
}