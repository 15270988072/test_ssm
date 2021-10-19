package com.lijing.service;

import com.lijing.dao.BookMapper;
import com.lijing.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BookService {

    //service调用dao层：组合Dao
    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

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
