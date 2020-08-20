package com.practice.book.book_practice.service;

import com.practice.book.book_practice.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IService {
    Book saveBook(Book book);
    List<Book> getBooks();
   Optional<Book>  getBook(Long id);
}
