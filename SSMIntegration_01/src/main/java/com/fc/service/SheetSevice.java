package com.fc.service;

import com.fc.bean.Sheet;

import java.util.List;

public interface SheetSevice {
    List<Sheet> findAll();

    List<Sheet> findSongsBySheet(String sheetName);

    int insertSheet(String sheetName);
}
