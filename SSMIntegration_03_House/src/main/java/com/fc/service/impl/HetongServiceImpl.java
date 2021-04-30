package com.fc.service.impl;

import com.fc.bean.Hetong;
import com.fc.dao.HetongMapper;
import com.fc.dao.HouselistMapper;
import com.fc.service.HetongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HetongServiceImpl implements HetongService {
    @Autowired
    private HetongMapper hetongMapper;
    @Autowired
    private HouselistMapper houselistMapper;
//    查看合同
    @Override
    public Hetong showHeTong(Integer house_id) {
        Hetong hetong = hetongMapper.showHeTong(house_id);
        return hetong;
    }
//      修改合同
    @Override
    public Integer updateHeTong(Hetong hetong) {
        Integer affectRows = hetongMapper.updateHeTong(hetong);
        System.out.println(affectRows);
        return affectRows;
    }
//      终止合同
    @Override
    public Integer deleteHeTong(Integer house_id) {
        Integer affectRows = hetongMapper.deleteHeTong(house_id);
        houselistMapper.updateHouselistStatus(house_id);
        return affectRows;
    }
}
