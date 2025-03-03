package com.library.repository;

import com.library.model.Book;

import java.util.List;

public interface BookRepository {
    void addBook(Book book);
    List<Book> getAllBooks();
}