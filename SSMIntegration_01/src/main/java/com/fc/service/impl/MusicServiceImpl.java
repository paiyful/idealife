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
//查找全部歌曲
    @Override
    public List<Music> getAll() {
        return musicDao.getAll();
    }
//通过歌曲id查找歌曲
    @Override
    public Music findById(Integer musicId) {
        return musicDao.findById(musicId);
    }
//上一首
    @Override
    public Music prevSong(Integer musicId) {
//        获取所有歌
        List<Music> list = musicDao.getAll();
//        当前下标位置
        int index= 0;
//        遍历所有歌
        for (int i = 0; i < list.size(); i++) {
//            如果musicId等于当前对象的MusicId
            if(musicId.equals(list.get(i).getMusicId())){
//                将id赋值到index
                index=i;
                break;
            }
        }
//        如果歌是第1首，则播放最后一首，如果歌不是第一首则播放上一首
        index=index==0? list.size()-1 : index-1;

        return list.get(index);
    }
//下一首
    @Override
    public Music nextSong(Integer musicId) {
//        获取所有歌
        List<Music> list = musicDao.getAll();
//        当前下标位置
        int index= 0;
//        遍历所有歌
        for (int i = 0; i < list.size(); i++) {
//            如果musicId等于当前对象的MusicId
            if(musicId.equals(list.get(i).getMusicId())){
//                将id赋值到index
                index=i;
                break;
            }
        }
        //        如果歌是最后一首，则播放第一首，如果歌不是最后一首则播放下一首
        index=index==list.size()-1? 0:index+1;

        return list.get(index);
    }
//通过关键词查找歌
    @Override
    public List<Music> search(String keyword) {
        return musicDao.search("%"+keyword+"%");
    }
}
