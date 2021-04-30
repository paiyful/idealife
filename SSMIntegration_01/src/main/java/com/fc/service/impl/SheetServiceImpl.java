package com.fc.service.impl;

import com.fc.bean.Sheet;
import com.fc.dao.SheetDao;
import com.fc.service.SheetSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheetServiceImpl implements SheetSevice {
    @Autowired
    private SheetDao sheetDao;
    @Override
    public List<Sheet> findAll() {
        return sheetDao.findAll();
    }

    @Override
    public List<Sheet> findSongsBySheet(String sheetName) {
        return sheetDao.findSongsBySheet(sheetName);
    }

    @Override
    public int insertSheet(String sheetName) {
        return sheetDao.insertSheet(sheetName);
    }
}
