package com.fc.service;

import com.fc.bean.Checkout;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CheckoutService {
//    跳转到已退租列表
    List<Checkout> getAllCheckOut();
//    分页
PageInfo<Checkout> pagination(Integer pageNum);
//      删除退租的信息
    Integer deleteCheckOut(Integer cid);
}
