package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//自动生成getter、setter、toString、hashcode、equals
@Data
//自动生成无参构造方法
@NoArgsConstructor
//自动生成有参构造方法
@AllArgsConstructor
public class Manager {
    private Integer mgrid;
    private String mgrname;
    private String mgrpwd;

}
