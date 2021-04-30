package com.fc.controller;

import com.fc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("Ajax")
public class AjaxController {
    @RequestMapping("TestAjax")
    public Map<String,Object> TestAjax(User user){
        System.out.println(user);
        Map<String, Object> map = new HashMap<>();
        map.put("code",200);
        map.put("success",true);
        map.put("user",new User("张三","1234"));
        return map;
    }
}
