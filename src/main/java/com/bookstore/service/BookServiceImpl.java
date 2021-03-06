package com.bookstore.service;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> listAll() {
        return bookRepository.listAllBooks();
    }

    @Override
    public Book findById(long id) {
        return bookRepository.findBookById(id);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void update(Long id, Book book) {
        bookRepository.update(id, book);
    }

    @Override
    public void delete(Long id) {
        bookRepository.delete(id);
    }


}
