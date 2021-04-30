package com.fc.dao;

import com.fc.bean.Music;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicDao {
    List<Music> findAll();
}
