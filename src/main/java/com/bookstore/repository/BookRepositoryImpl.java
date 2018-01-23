package com.bookstore.repository;

import com.bookstore.model.Book;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookRepositoryImpl implements BookRepository {

    private HashMap<Long, Book> booksStore = new HashMap<>();

    @PostConstruct
    public void init() {
        Book book = new Book();
        book.setId(1);
        book.setTitle("The Hobbit");
        book.setAuthor("J.R.R Tolkien");
        book.setCategory("High fantasy");
        booksStore.put(book.getId(), book);

        book = new Book();
        book.setId(2);
        book.setTitle("The Shining");
        book.setAuthor("Stephen King");
        book.setCategory("Horror");
        booksStore.put(book.getId(), book);

        book = new Book();
        book.setId(3);
        book.setTitle("Twenty Thousand Leagues Under the Sea");
        book.setAuthor("Jules Verne");
        book.setCategory("Fiction");
        booksStore.put(book.getId(), book);

    }

    @Override
    public List<Book> listAllBooks() {
        return booksStore.values().stream().collect(Collectors.toList());
    }

    @Override
    public Book findBookById(long id) {
        return booksStore.get(id);
    }
}
