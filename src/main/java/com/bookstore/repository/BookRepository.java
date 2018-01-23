package com.bookstore.repository;

import com.bookstore.model.Book;

import java.util.List;

public interface BookRepository {

    List<Book> listAllBooks();
    Book findBookById(long id);
}
