package com.fc.service;

import com.fc.bean.Hetong;

public interface HetongService {
//    查看合同
    Hetong showHeTong(Integer house_id);
//      修改合同
    Integer updateHeTong(Hetong hetong);
//      终止合同
    Integer deleteHeTong(Integer house_id);
}
