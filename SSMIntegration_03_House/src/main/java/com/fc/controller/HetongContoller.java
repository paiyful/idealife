package com.fc.controller;

import com.fc.bean.Hetong;
import com.fc.service.HetongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("hetong")
public class HetongContoller {
    @Autowired
    private HetongService hetongService;
//    查看合同
    @RequestMapping("showHeTong")
    public ModelAndView showHeTong(Integer house_id){
        ModelAndView mv = new ModelAndView();
        Hetong hetong= hetongService.showHeTong(house_id);
        System.out.println(hetong);
        mv.addObject("hetong",hetong);
        mv.setViewName("/admin/hetong.jsp");
        return mv;
    }
//    跳转修改合同
    @RequestMapping("toUpdateHeTong")
    public ModelAndView toUpdateHeTong(Integer house_id){
        ModelAndView mv = new ModelAndView();
        Hetong hetong = hetongService.showHeTong(house_id);
        mv.addObject("hetong",hetong);
        mv.setViewName("/admin/updatehetong.jsp");
        return mv;
    }
//    修改合同
    @RequestMapping("updateHeTong")
    public ModelAndView updateHeTong(Hetong hetong){
        ModelAndView mv = new ModelAndView();
        System.out.println(hetong);
        Integer affectRows = hetongService.updateHeTong(hetong);
        if(affectRows>0){
            mv.addObject("error","修改成功！");
            mv.setViewName("/admin/main1.jsp");
        }else{
            mv.addObject("error","修改失败！");
        }
        return mv;
    }
//    终止合同
    @RequestMapping("deleteHeTong")
    public ModelAndView deleteHeTong(Integer house_id){
        ModelAndView mv = new ModelAndView();
        Integer affectRows = hetongService.deleteHeTong(house_id);
        if(affectRows>0){
            mv.addObject("error","终止成功！");
            mv.setViewName("/admin/main1.jsp");
        }else{
            mv.addObject("error","终止失败！");
            mv.setViewName("/admin/main1.jsp");
        }
        return mv;
    }
}
