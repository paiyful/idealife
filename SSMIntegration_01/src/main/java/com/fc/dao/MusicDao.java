package com.fc.dao;

import com.fc.bean.Music;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicDao {
    List<Music> getAll();

    Music findById(@Param("musicId") Integer musicId);

    List<Music> search(String keyword);
}
