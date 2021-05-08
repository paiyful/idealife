package com.fc.controller;

import com.fc.bean.Houselist;
import com.fc.service.HouseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("house")
public class HouseListController {
    @Autowired
    private HouseListService houseListService;

    //    查询全部的房源
    @RequestMapping("showHouseList")
    public ModelAndView showHouseList(Integer pageNum) {
        ModelAndView mv = new ModelAndView();
            //        分页
        mv.addObject("p",houseListService.pagination(pageNum));
        mv.addObject("houselists",houseListService.pagination(pageNum).getList());
        mv.setViewName("/admin/ahouselist.jsp");
        return mv;
    }
    //    上下页
    @RequestMapping("ahouselist.action")
    public ModelAndView ahouselist(Integer page){
        return showHouseList(page);
    }
    //    显示修改页面
    @GetMapping("houseInfo")
    public ModelAndView houseInfo(Integer id) {
        ModelAndView mv = new ModelAndView();
        Houselist houselist = houseListService.houseInfo(id);
        mv.addObject("houselist",houselist);
        mv.setViewName("/admin/changehouse.jsp");
        return mv;
    }
//     修改房源
    @RequestMapping("houseUpdate")
    public ModelAndView houseUpdate(Houselist houselist) {
        ModelAndView mv = new ModelAndView();
        int affectRows = houseListService.houseUpdate(houselist);
        if (affectRows > 0) {
            mv.addObject("houselist",houselist);
            mv.addObject("error","更新成功！");
            mv.setViewName("/admin/main1.jsp");
        }else{
            mv.addObject("error", "修改失败！");
            mv.setViewName("/admin/main1.jsp");
        }
        return mv;
    }
//    删除房源
    @RequestMapping("deleteHouse")
    public ModelAndView deleteHouse(Houselist houselist){
        ModelAndView mv = new ModelAndView();
        Integer affectRows = houseListService.deleteHouse(houselist);
        if(affectRows>0){
            System.out.println("删除成功！");
            mv.setViewName("/admin/main1.jsp");
        }else{
            System.out.println("删除失败！");
            mv.setViewName("/admin/mian1.jsp");
        }
        return mv;
    }
//    跳转到添加房源
    @RequestMapping("toaddhouse")
    public ModelAndView toaddhouse(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/admin/addhouse.jsp");
        return mv;
    }
//    添加房源
    @RequestMapping("addhouse")
    public ModelAndView addhouse(Houselist houselist){
        ModelAndView mv = new ModelAndView();
        List<Houselist> list = houseListService.findHouseid(houselist);
//        判断是否有一样的房源,如果不为空则增加房源
        if(list.size()!=0){
            mv.addObject("error","有相同的房源类型");
            mv.setViewName("/admin/main1.jsp");
        }else{
            Integer affectRows = houseListService.addhouse(houselist);
            System.out.println(affectRows);
            if(affectRows>0){
                mv.addObject("error","添加房源成功！");
                mv.addObject("houselist",houselist);
                mv.setViewName("/admin/main1.jsp");
            }else{
                mv.addObject("error","添加失败!");
                mv.setViewName("/admin/main1.jsp");
            }
        }
        return mv;
    }

}
