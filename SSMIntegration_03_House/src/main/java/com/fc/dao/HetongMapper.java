package com.fc.dao;

import com.fc.bean.Hetong;
import com.fc.bean.HetongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HetongMapper {
    long countByExample(HetongExample example);

    int deleteByExample(HetongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hetong record);

    int insertSelective(Hetong record);

    List<Hetong> selectByExample(HetongExample example);

    Hetong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hetong record, @Param("example") HetongExample example);

    int updateByExample(@Param("record") Hetong record, @Param("example") HetongExample example);

    int updateByPrimaryKeySelective(Hetong record);

    int updateByPrimaryKey(Hetong record);
// 通过house_id查看合同
    Hetong showHeTong(@Param("house_id") Integer house_id);
//    修改合同
     Integer updateHeTong(@Param("hetong") Hetong hetong);
//      终止合同
    Integer deleteHeTong(Integer house_id);
//

//    添加合同
    Integer inserHetong(Integer house_id);
}