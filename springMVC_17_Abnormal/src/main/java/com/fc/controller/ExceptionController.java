package com.fc.controller;

import com.fc.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("exception")
public class ExceptionController {
//    测试自定义异常
@RequestMapping("testMyException")
    public void testMyException(){
    System.out.println("自定义异常发生了");
        throw new MyException("自定义异常出现了");
    }
//    测试系统异常
    @RequestMapping("testSystemException")
    public void testSystemException(){
//    系统异常！by / zero
        System.out.println("系统异常发生了！");
        int i=1/0;
    }

}
