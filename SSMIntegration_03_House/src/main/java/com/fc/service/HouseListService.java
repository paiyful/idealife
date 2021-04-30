package com.fc.service;

import com.fc.bean.Houselist;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface HouseListService {
//    查询全部房源
    List<Houselist> showHouseList();
//    按照id查找房源
    Houselist houseInfo(Integer id);
//    修改房源
    Integer houseUpdate(Houselist houselist);
//    删除房源
    Integer deleteHouse(Houselist houselist);
//     添加房源
    Integer addhouse(Houselist houselist);
//    通过houseid查询房源
    List<Houselist> findHouseid(Houselist houselist);
//    分页
    PageInfo<Houselist> pagination(Integer pageNum);

}
