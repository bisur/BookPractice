package com.practice.book.book_practice.service;

import com.practice.book.book_practice.domain.Book;
import com.practice.book.book_practice.repository.Irepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class IServiceImpl implements IService {
 @Autowired
  private Irepository irepository;
    @Override
    public Book saveBook(Book book) {
      return irepository.save(book);
    }

    @Override
    public List<Book> getBooks() {

        return irepository.findAll();
    }

    @Override
    public Optional<Book> getBook(Long id) {
        return irepository.findById(id);
    }
}
