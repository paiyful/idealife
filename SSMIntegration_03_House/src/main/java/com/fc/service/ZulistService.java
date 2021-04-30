package com.fc.service;

import com.fc.bean.Hetong;
import com.fc.bean.Zulist;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ZulistService {
    //    查看在租的房源
    List<Zulist> toZuList();
    //  分页
    PageInfo<Zulist> pagination(Integer pageNum);
}
