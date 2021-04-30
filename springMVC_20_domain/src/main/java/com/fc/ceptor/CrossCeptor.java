package com.fc.ceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CrossCeptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("跨域拦截器已执行!");
        //        设置响应头 Access-Control-Allow-Origin   *为全部放行！
        response.setHeader("Access-Control-Allow-Origin", "*");
//        设置响应头 Access-Control-Allow-Method  写放行的请求方法
        response.setHeader("Access-Control-Allow-Method", "GET,POST,DETELE,PUT,OPTIONS");
//        设置响应头 Access-Control-Allow-Max-Age   放行的最大时间（以秒为基准）3600秒是一小时
        response.setHeader("Access-Control-Allow-Max-Age", "1800");
//
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, Authorization, Accept, X-Requested-With");

        return true;
    }
}
