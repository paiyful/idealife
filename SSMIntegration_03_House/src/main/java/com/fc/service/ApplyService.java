package com.fc.service;

import com.fc.bean.Apply;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ApplyService {
//    查询所有看房申请
    List<Apply> findAllApply();
//     分页
    PageInfo<Apply> pagination(Integer pageNum);

    Integer reFuseApply(String houseId);
}
