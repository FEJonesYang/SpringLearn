package com.jony.springlearn.service.impl;

import com.jony.springlearn.dao.BookDao;
import com.jony.springlearn.dao.impl.BookDaoImpl;
import com.jony.springlearn.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("BookService save...");
        bookDao.save();
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
}
