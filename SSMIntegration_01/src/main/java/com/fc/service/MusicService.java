package com.fc.service;

import com.fc.bean.Music;

import java.util.List;

public interface MusicService {
    List<Music> getAll();

    Music findById(Integer musicId);

    Music prevSong(Integer musicId);

    Music nextSong(Integer musicId);

    List<Music> search(String keyword);
}
