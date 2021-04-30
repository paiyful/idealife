package com.fc.exception;


import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//自定义异常处理器，用来处理全局异常                       处理器异常解析器
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView view = new ModelAndView();
        System.out.println("系统发生异常!");
        if(e instanceof MyException){
            System.out.println("自定义异常被处理");
            view.addObject("message","自定义异常:\t"+e.getMessage());
        }else{
            System.out.println("系统异常被处理");
            view.addObject("message","系统异常:\t"+e.getMessage());
        }
        view.setViewName("/abnormal.jsp");
        return view;
    }
}
