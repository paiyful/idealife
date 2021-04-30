package com.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//通过依赖导入bean包
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    @Value("陈冠希")
    private String name;
    @Value("10")
    private Integer id;
}
