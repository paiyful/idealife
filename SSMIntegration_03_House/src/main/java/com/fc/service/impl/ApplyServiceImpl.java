package com.fc.service.impl;

import com.fc.bean.Apply;
import com.fc.bean.ApplyExample;
import com.fc.dao.ApplyMapper;
import com.fc.service.ApplyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyServiceImpl implements ApplyService {
    @Autowired
    private ApplyMapper applyMapper;
//  查询所有看房的申请
    @Override
    public List<Apply> findAllApply() {
        return applyMapper.findAllApply();
    }
//    分页
    @Override
    public PageInfo<Apply> pagination(Integer pageNum) {
        if(pageNum==null||pageNum<=0){
            pageNum=1;
        }
        PageHelper.startPage(pageNum,4);
        PageInfo<Apply> pageInfo = new PageInfo<>(findAllApply());
        return pageInfo;
    }
//    拒绝租贷
    @Override
    public Integer reFuseApply(String houseId) {
        ApplyExample example = new ApplyExample();
        ApplyExample.Criteria criteria = example.createCriteria();
        criteria.andHouseIdEqualTo(houseId);
        int affectRows = applyMapper.deleteByExample(example);
        return affectRows;
    }


}
