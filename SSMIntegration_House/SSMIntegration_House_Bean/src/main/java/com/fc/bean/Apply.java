package com.fc.bean;

import org.springframework.stereotype.Component;

@Component
public class Apply extends ApplyKey {
    private Integer userlistId;

    public Integer getUserlistId() {
        return userlistId;
    }

    public void setUserlistId(Integer userlistId) {
        this.userlistId = userlistId;
    }
}