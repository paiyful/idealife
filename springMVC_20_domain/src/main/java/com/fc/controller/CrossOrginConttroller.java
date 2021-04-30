package com.fc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("cross")
public class CrossOrginConttroller {
    @RequestMapping("test")
    public Map<String,Object> test(){
        Map<String, Object> map = new HashMap<>();
        map.put("code",200);
        map.put("success",true);
        map.put("message","请求成功！");
        return map;
    }
}
