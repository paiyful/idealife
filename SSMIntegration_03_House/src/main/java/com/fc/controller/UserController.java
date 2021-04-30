package com.fc.controller;

import com.fc.bean.User;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    //    注解注入
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public ModelAndView login(User user, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        List<User> users = userService.login(user);
//        如果数据库没有查到
        if (users != null && users.size()!=0) {
            session.setAttribute("user", users.get(0));
            //            判断是否为管理员
            String type = "admin";
            if (type.equals(users.get(0).getType())) {
                mv.setViewName("/admin/main1.jsp");
            } else {
                mv.setViewName("/zuke/main.jsp");
            }
        } else {
            mv.addObject("error", "error");
            mv.setViewName("../../../index.jsp");
        }
        return mv;
    }
}
