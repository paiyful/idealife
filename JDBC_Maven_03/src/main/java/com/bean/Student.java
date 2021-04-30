package com.bean;


public class Student{
    private Integer id;
    private String name;
    private Integer sroce;
    private String gender;
    private String info;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sroce=" + sroce +
                ", gender='" + gender + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public Student(){

    }

    public Student(Integer id, String name, Integer sroce, String gender, String info) {
        this.id = id;
        this.name = name;
        this.sroce = sroce;
        this.gender = gender;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getsroce() {
        return sroce;
    }

    public void setsroce(Integer sroce) {
        this.sroce = sroce;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
