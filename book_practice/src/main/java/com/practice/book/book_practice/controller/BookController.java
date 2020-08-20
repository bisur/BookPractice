package com.practice.book.book_practice.controller;

import com.practice.book.book_practice.domain.Book;
import com.practice.book.book_practice.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private IService iService;

    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book){
       return iService.saveBook(book);
    }
     @GetMapping("/getBooks")
    public List<Book> getBooks(Book book){
       return iService.getBooks();
    }

    @GetMapping("/getBook/{id}")
    public Optional<Book> getBookById(@PathVariable Long id){
        return iService.getBook(id);
    }




}
