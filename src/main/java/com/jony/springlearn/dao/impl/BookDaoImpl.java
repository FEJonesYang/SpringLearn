package com.jony.springlearn.dao.impl;

import com.jony.springlearn.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao save...");
    }
}
