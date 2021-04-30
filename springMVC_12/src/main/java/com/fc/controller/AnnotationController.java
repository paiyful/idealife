package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class AnnotationController {
    @RequestMapping("test")
    @ResponseBody
    //RequestParam
// value对应前端的参数名
//    required：true代表必须携带此参数false可以不带
    public String test(@RequestParam(value = "id",required = true) Integer userId, @RequestParam(value = "name",required = false) String userName){
        System.out.println(userId);
        System.out.println(userName);
        return userId+"\t"+userName;
    }
    @RequestMapping("testVariable/{id}")
    @ResponseBody
    public Integer testVariable(@PathVariable(value = "id") Integer userId){

        return userId;
    }
    @RequestMapping("testMap")
    @ResponseBody
    public Map<String,Object> testMap(){
        Map<String, Object> objectObjectMap = new HashMap<>();
        objectObjectMap.put("username","易烊千玺");
        objectObjectMap.put("password",1234);
        List<String> list= new ArrayList<>();
        list.add("烤羊排");
        list.add("炒饭");
        objectObjectMap.put("list",list);
        return objectObjectMap;
    }



}
