package com.fc.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fc.bean.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    @Test
    public void testObjectToJsonObject(){
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setPassword("1234");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String s = mapper.writeValueAsString(user);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test(){
        List<Object> objects = new ArrayList<>();
        objects.add(new User("李四","1234",5));
        objects.add(new User("王五","1234",6));
        objects.add(new User("赵六","1234",7));
        ObjectMapper mapper = new ObjectMapper();
        String s = null;
        try {
            s = mapper.writeValueAsString(objects);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test2(){
        Map<String,User> map = new HashMap<>();
        map.put("User1",new User("张三","1234",1));
        map.put("User2",new User("李四","1234",2));
        map.put("User3",new User("王五","1234",3));
//    准备获取核心类对象
        ObjectMapper mapper = new ObjectMapper();
        try {
            String s = mapper.writeValueAsString(map);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testJsonstrToJavaObject(){
        String jsonStr="{\"name\":\"李四\",\"password\":\"1234\",\"id\":2}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            User user = mapper.readValue(jsonStr, User.class);
            System.out.println(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
