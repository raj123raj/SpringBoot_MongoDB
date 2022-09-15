package com.gfg.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gfg.docs.Book;

public interface BookRepository extends MongoRepository<Book,Long> {
    List<Book> findByCategory(String category);
    Book findByBookId(long bookId);
}
