package com.fc.ceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fc.bean.user;
import com.fc.vo.Uservo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInterCeptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("前置处理!!"+handler);
        Uservo uservo = new Uservo();
        uservo.setCode(40000);
        uservo.setData(null);
        uservo.setSuccess(false);
        uservo.setMessage("没有接收到年龄！");
        String param = request.getParameter("age");
        if(param != null){
            int age = Integer.valueOf(param);

            if(age>18){
                return true;
            }else{
                uservo.setCode(40000);
                uservo.setData(null);
                uservo.setSuccess(false);
                uservo.setMessage("没有找到!!!");
            }
        }

        response.setContentType("Application/json; charset=UTF-8");

        // 创建一个json解析的对象
        ObjectMapper mapper = new ObjectMapper();

        // 将java对象转为json字符串
        String jsonStr = mapper.writeValueAsString(uservo);

        // 响应给前端
        response.getWriter().append(jsonStr);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("后置处理！！！"+handler);
        Uservo uservo = new Uservo();
        uservo.setCode(200);
        uservo.setData(new user("张三",19));
        uservo.setSuccess(true);
        uservo.setMessage("恭喜！找到了");
        response.setContentType("application/json,charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        String data = mapper.writeValueAsString(uservo);
        response.getWriter().append(data);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("渲染处理！"+handler);
    }
}
