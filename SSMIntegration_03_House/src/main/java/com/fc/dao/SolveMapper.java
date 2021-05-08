package com.fc.dao;

import com.fc.bean.Solve;
import com.fc.bean.SolveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SolveMapper {
    long countByExample(SolveExample example);

    int deleteByExample(SolveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Solve record);

    int insertSelective(Solve record);

    List<Solve> selectByExampleWithBLOBs(SolveExample example);

    List<Solve> selectByExample(SolveExample example);

    Solve selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Solve record, @Param("example") SolveExample example);

    int updateByExampleWithBLOBs(@Param("record") Solve record, @Param("example") SolveExample example);

    int updateByExample(@Param("record") Solve record, @Param("example") SolveExample example);

    int updateByPrimaryKeySelective(Solve record);

    int updateByPrimaryKeyWithBLOBs(Solve record);

    int updateByPrimaryKey(Solve record);
//      添加已处理信息
    Integer insertSolveWithWrong(@Param("id") Integer id);
//    将未处理全部全部变成已处理
    Integer updateSolveStatus();
//      查询所有已处理的信息
    List<Solve> selectAll();
}