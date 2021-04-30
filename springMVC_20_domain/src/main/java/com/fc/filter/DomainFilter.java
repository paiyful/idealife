package com.fc.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DomainFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("跨域过滤器已执行");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
//        设置响应头 Access-Control-Allow-Origin   *为全部放行！
        res.setHeader("Access-Control-Allow-Origin", "*");
//        设置响应头 Access-Control-Allow-Method  写放行的请求方法
        res.setHeader("Access-Control-Allow-Method", "GET,POST,DETELE,PUT,OPTIONS");
//        设置响应头 Access-Control-Allow-Max-Age   放行的最大时间（以秒为基准）3600秒是一小时
        res.setHeader("Access-Control-Allow-Max-Age", "1800");
//
        res.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, Authorization, Accept, X-Requested-With");
        String curOrigin = request.getHeader("Origin");
        System.out.println("跨域过滤器被执行，当前访问来源者为：" + curOrigin);

        filterChain.doFilter(request,res);
    }

    @Override
    public void destroy() {

    }
}
