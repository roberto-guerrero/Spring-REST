package com.bookstore.service;

import com.bookstore.model.Book;

import java.util.List;

public interface BookService {

    List<Book> listAll();
    Book findById(long id);
}
