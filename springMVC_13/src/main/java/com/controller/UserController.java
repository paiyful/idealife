package com.controller;

import com.bean.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class UserController {
//    字符串跳转
    @GetMapping("testToString")
    public String testToString(){
        return "/login.html";
    }
//    ModelAndView 键值对的方式
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","茄子");
        modelAndView.setViewName("/login.html");
        System.out.println(modelAndView);
        return modelAndView;
    }
    @GetMapping("testModelAndViewObject")
//    ModelAndView 放对象的方式
    public ModelAndView testModelAndViewObject(){
        User user = new User();
        user.setAge(18);
        user.setName("张三");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(user);
        modelAndView.setViewName("/login.html");
        System.out.println(modelAndView);
        return modelAndView;
    }
    @GetMapping("testResponseLink")
//    使用重定向
    public void testResponseLink(HttpServletResponse response){
        try {
            response.sendRedirect("/login.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    使用请求转发
    @GetMapping("testRequest")
    public void testRequest(HttpServletRequest request,HttpServletResponse response){
        try {
            request.getRequestDispatcher("/login.html").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    字符串路径重定向
//    redirect:/重定向的路径
    @GetMapping("testStringRedirect")
    public String testStringRedirect(){
        return "redirect:/login.html";
    }
//    字符串路径转发
//    forward:/转发路径
    @GetMapping("testStringForward")
    public String testStringForward(){
        return "forward:/login.html";
    }
}
