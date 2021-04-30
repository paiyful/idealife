package com.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data//set、get、tostring...
@NoArgsConstructor//创建无参构造函数
@AllArgsConstructor//创建有参构造函数
public class Student {
    private String name;
    private String password;
    private List<String> food;
    private Car car;
}
