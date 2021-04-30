package com.fc.service.impl;

import com.fc.bean.Houselist;
import com.fc.bean.HouselistExample;
import com.fc.dao.HouselistMapper;
import com.fc.service.HouseListService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseListServiceImpl implements HouseListService {
    @Autowired
    private HouselistMapper houselistMapper;
//    查询全部的房源
    @Override
    public List<Houselist> showHouseList() {
        HouselistExample example = new HouselistExample();
        example.setOrderByClause("houseid");
        List<Houselist> houselists = houselistMapper.selectByExample(example);
        return houselists;
    }
// 通过id查询房源
    @Override
    public Houselist houseInfo(Integer id) {
        HouselistExample example = new HouselistExample();
        HouselistExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Houselist> list = houselistMapper.selectByExample(example);
        return list.get(0);
    }
    //    修改房源
    @Override
    public Integer houseUpdate(Houselist houselist){
        HouselistExample example = new HouselistExample();
        HouselistExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(houselist.getId());
        int i = houselistMapper.updateByExample(houselist,example);
        return i;
    }
//         删除房源
    @Override
    public Integer deleteHouse(Houselist houselist) {
        HouselistExample example = new HouselistExample();
        HouselistExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(houselist.getId());
        int affectRows = houselistMapper.deleteByExample(example);
        return affectRows;
    }
//          添加房源    按照houselist对象添加
    @Override
    public Integer addhouse(Houselist houselist) {
        int affectRows = houselistMapper.insertSelective(houselist);
        return affectRows;
    }
    //    通过houseid查询房源
    @Override
    public List<Houselist> findHouseid(Houselist houselist) {
        HouselistExample example = new HouselistExample();
        HouselistExample.Criteria criteria = example.createCriteria();
        criteria.andHouseidEqualTo(houselist.getHouseid());
        List<Houselist> houselists = houselistMapper.selectByExample(example);
        return houselists;
    }
    //    分页
    public PageInfo<Houselist> pagination(Integer pageNum){
        if(pageNum==null || pageNum<=0){
            pageNum=1;
        }
        //        一页四行数据
        PageHelper.startPage(pageNum,4);

        PageInfo<Houselist> pageInfo = new PageInfo<>(showHouseList());
        return pageInfo;
    }
}
