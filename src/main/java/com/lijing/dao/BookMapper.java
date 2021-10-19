package com.lijing.dao;

import com.lijing.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //查询全部的书籍
    List<Books> booksList();

    //添加书籍
    int addBook(Books books);

    //删除书籍
    int deleteBookById(@Param("bookID") int id);

    //更新书籍
    int updateBook(Books books);

    //查询书籍
    int findBook(int id);
}
