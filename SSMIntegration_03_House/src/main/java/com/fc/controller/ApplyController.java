package com.fc.controller;

import com.fc.bean.Apply;
import com.fc.service.ApplyService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("apply")
public class ApplyController {
    @Autowired
    private ApplyService applyService;

    @RequestMapping("findAllApply")
    public ModelAndView findAllApply(Integer pageNum){
        ModelAndView mv = new ModelAndView();
//        分页
        PageInfo<Apply> pagination = applyService.pagination(pageNum);
        mv.addObject("applylist",pagination.getList());
        mv.addObject("p",pagination);
        mv.setViewName("/admin/applylist.jsp");
        return mv;
    }

//    上下页
    @RequestMapping("houselist.action")
    public  ModelAndView houselist(Integer page){
        return findAllApply(page);
    }
//    拒绝租贷
    @RequestMapping("reFuseApply")
    public ModelAndView reFuseApply(String houseId){
        ModelAndView mv = new ModelAndView();
        Integer affectRows = applyService.reFuseApply(houseId);
        if(affectRows>0){
            mv.addObject("error","拒绝成功！");
            mv.setViewName("/admin/main1.jsp");
        }else{
            mv.addObject("error","拒绝失败！");
            mv.setViewName("/admin/main1.jsp");
        }
        return mv;
    }

}
