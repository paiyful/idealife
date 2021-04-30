package com.fc.test;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Test {
    @org.junit.Test
    public void createToken() throws UnsupportedEncodingException {
        Map<String, Object> header = new HashMap<>();
        header.put("alg","HS256");
        header.put("typ","JWT");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE,1);
        String token=JWT.create()
                .withHeader(header)
                .withClaim("username","张三")
                .withClaim("password","123456")
                .withExpiresAt(calendar.getTime())
                .sign(Algorithm.HMAC256("123567"));
        System.out.println(token);

    }
}
