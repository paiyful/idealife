package com.fc.controller;

import com.fc.bean.Sheet;
import com.fc.service.SheetSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("sheet")
public class SheetController {
    @Autowired
    private SheetSevice sheetSevice;
//    查找所有的歌单
    @RequestMapping("findAll")
    public List<Sheet> findAll(){
        return sheetSevice.findAll();
    }
    @RequestMapping("findSongsBySheet")
    public List<Sheet> findSongsBySheet(String sheetName){
        return sheetSevice.findSongsBySheet(sheetName);
    }

    @RequestMapping("insertSheet")
    public Map<String,Object> insertSheet(String sheetName){
        int affectRows=sheetSevice.insertSheet(sheetName);

        Map<String, Object> map = new HashMap<>();
        if(affectRows>0){
            map.put("message","成功");
        }
        else{
            map.put("message","失败");
        }
        return map;
    }
}
