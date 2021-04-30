package com.fc.controller;

import com.fc.bean.Music;
import com.fc.service.MusicService;
import com.fc.service.impl.MusicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("music")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @RequestMapping("findAll")
    public List<Music> getAll(){
        return musicService.getAll();
    }
    @RequestMapping("findById")
    public Music findById(Integer musicId){
        return musicService.findById(musicId);
    }
    @RequestMapping("prevSong")
    public Music prevSong(Integer musicId){
        return musicService.prevSong(musicId);
    }
    @RequestMapping("nextSong")
    public Music nextSong(Integer musicId){
        return musicService.nextSong(musicId);
    }
    @RequestMapping("search")
    public List<Music> search(String keyword){
        return musicService.search(keyword);
    }

}
