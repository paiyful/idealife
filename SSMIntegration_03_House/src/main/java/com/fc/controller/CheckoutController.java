package com.fc.controller;

import com.fc.bean.Checkout;
import com.fc.service.CheckoutService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("checkout")
public class CheckoutController {
    @Autowired
    private CheckoutService checkoutService;
//    查询全部的退租信息
    @RequestMapping("getAllCheckOut")
    public ModelAndView getAllCheckOut(Integer pageNum){
        ModelAndView mv = new ModelAndView();
//        分页
        PageInfo<Checkout> pagination = checkoutService.pagination(pageNum);
        mv.addObject("checkout",pagination.getList());
        mv.addObject("p",pagination);
        mv.setViewName("/admin/checkout.jsp");
        return mv;
    }
//    上下页
    @RequestMapping("getallcheckout.action")
    public ModelAndView getallcheckout(Integer page){
        return getAllCheckOut(page);
    }
//    删除
    @RequestMapping("deleteCheckOut")
    public ModelAndView deleteCheckOut(Integer cid){
        ModelAndView mv = new ModelAndView();
        Integer affectRows = checkoutService.deleteCheckOut(cid);
        System.out.println(affectRows);
        if(affectRows>0){
            mv.addObject("error","删除成功！");
            mv.setViewName("/admin/main1.jsp");
        }else{
            mv.addObject("error","删除失败！");
        }
        return mv;

    }
}
