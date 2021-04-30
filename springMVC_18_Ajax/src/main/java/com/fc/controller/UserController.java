package com.fc.controller;

import com.fc.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("test")
public class UserController {
    @RequestMapping("AjaxTest")
    public Map<String,Object> AjaxTest(User user){
        System.out.println(user);
        Map<String, Object> map = new HashMap<>();
        map.put("code",200);
        map.put("success",true);
        map.put("message","请求成功！");
        map.put("user",new User("zxc","123456"));
        return map;
    }
}
