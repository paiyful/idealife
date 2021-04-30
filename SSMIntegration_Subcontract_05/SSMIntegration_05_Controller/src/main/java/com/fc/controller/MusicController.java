package com.fc.controller;

import com.fc.bean.Music;
import com.fc.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("music")
public class MusicController {
    @Autowired
    private MusicService musicService;
    @RequestMapping("findAll")
    public List<Music> findAll(){
        return musicService.findAll();
    }
}
