package com.library.service;

import com.library.model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> getAllBooks();
}
