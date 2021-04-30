package com.fc.service.impl;

import com.fc.bean.Music;
import com.fc.dao.MusicDao;
import com.fc.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicDao musicDao;
    @Override
    public List<Music> findAll() {
        return musicDao.findAll();
    }
}
