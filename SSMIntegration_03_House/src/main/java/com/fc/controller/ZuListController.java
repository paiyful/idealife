package com.fc.controller;

import com.fc.bean.Hetong;
import com.fc.bean.Zulist;
import com.fc.service.HetongService;
import com.fc.service.ZulistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("zu")
public class ZuListController {
    @Autowired
    private ZulistService zulistService;
    @Autowired
    private HetongService hetongService;
//    查询全部的已租贷
    @RequestMapping("toZuList")
    public ModelAndView toZuList(Integer pageNum){
        ModelAndView mv = new ModelAndView();
//        分页
        mv.addObject("p",zulistService.pagination(pageNum));
        mv.addObject("zulist",zulistService.pagination(pageNum).getList());
        mv.setViewName("/admin/zulist.jsp");
        return mv;
    }
//    分页跳转
    @RequestMapping("findzulist.action")
    public ModelAndView findzulist(Integer page){
        return toZuList(page);
    }
//    跳转合同页面
    @RequestMapping("toAddZuList")
    public ModelAndView toAddZuList(Integer houseId){
        ModelAndView mv = new ModelAndView();
        Hetong hetong = hetongService.showHeTong(houseId);
        System.out.println(hetong);
        if(hetong==null){
            hetong = new Hetong();
            hetong.setHouseId(houseId.toString());
            mv.addObject("hetong",hetong);
            mv.setViewName("/admin/addhetong.jsp");
        }else{
            mv.addObject("hetong",hetong);
            mv.setViewName("/admin/addhetong.jsp");
        }
        return mv;
    }
}
