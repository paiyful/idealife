package com.fc.service.impl;

import com.fc.bean.Hetong;
import com.fc.bean.Zulist;
import com.fc.dao.HetongMapper;
import com.fc.dao.ZulistMapper;
import com.fc.service.ZulistService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZulistServiceImpl implements ZulistService {
    @Autowired
    private ZulistMapper zulistMapper;
    @Autowired
    private HetongMapper hetongMapper;
//    查询已租贷的房源
    @Override
    public List<Zulist> toZuList() {
        List<Zulist> zulists = zulistMapper.toZuList();
        return zulists;
    }
    public PageInfo<Zulist> pagination(Integer pageNum){
        if(pageNum==null || pageNum<=0){
            pageNum=1;
        }
        PageHelper.startPage(pageNum,4);
        PageInfo<Zulist> pageInfo = new PageInfo<>(toZuList());
        return pageInfo;
    }
}
