package com.fc.service;

import com.fc.bean.Music;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MusicService {
    List<Music> findAll();
}
