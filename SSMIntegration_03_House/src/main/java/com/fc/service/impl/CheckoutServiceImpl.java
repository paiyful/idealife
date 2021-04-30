package com.fc.service.impl;

import com.fc.bean.Checkout;
import com.fc.dao.CheckoutMapper;
import com.fc.service.CheckoutService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    private CheckoutMapper checkoutMapper;
//查询全部退租信息
    @Override
    public List<Checkout> getAllCheckOut() {
        return checkoutMapper.getAllCheckOut();
    }
//    分页
    public PageInfo<Checkout> pagination(Integer pageNum){
        if(pageNum==null || pageNum<=0){
            pageNum=1;
        }
        PageHelper.startPage(pageNum,4);
        PageInfo<Checkout> pageInfo = new PageInfo<>(getAllCheckOut());
        return pageInfo;
    }
//     删除退租信息
    @Override
    public Integer deleteCheckOut(Integer cid) {
        int affectRows = checkoutMapper.deleteByPrimaryKey(cid);
        return affectRows;
    }
}
