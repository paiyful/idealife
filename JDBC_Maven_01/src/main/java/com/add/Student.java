package com.add;

import java.util.Date;

public class Student {
    private Integer id;
    private String uname;
    private Integer age;
    private Date brithday;

    public Student(Integer id, String uname, Integer age, Date brithday) {
        this.id = id;
        this.uname = uname;
        this.age = age;
        this.brithday = brithday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }
}
