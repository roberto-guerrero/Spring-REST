package com.bookstore.controller;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Book> list(){
        return bookService.listAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book findBookById(@PathVariable long id){
        return bookService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createBook(@RequestBody Book book){
        bookService.save(book);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable Long id, @RequestBody Book book){
        bookService.update(id, book);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }
}
