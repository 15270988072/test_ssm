package com.lijing.service;

import com.lijing.dao.BookMapper;
import com.lijing.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BookService {
    //service调用dao层：组合Dao
    private BookMapper bookMapper;

    public List<Books> booksList() {
        return bookMapper.booksList();
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public int findBook(int id) {
        return bookMapper.findBook(id);
    }
}
