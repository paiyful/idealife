package com.fc.dao;

import com.fc.bean.Sheet;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SheetDao {
    List<Sheet> findAll();

    List<Sheet> findSongsBySheet(@Param("sheetName") String sheetName);


    int insertSheet(@Param("sheetName") String sheetName);
}
