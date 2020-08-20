package com.practice.book.book_practice.repository;

import com.practice.book.book_practice.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Irepository extends JpaRepository<Book,Long> {
}
