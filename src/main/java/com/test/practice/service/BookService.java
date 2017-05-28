package com.test.practice.service;

import com.test.practice.dao.BookDAO;
import com.test.practice.entity.Book;

import java.util.List;

public class BookService {

    private final BookDAO bookDAO;

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<Book> getAll() {
        return bookDAO.getAll();
    }

    public void addBook(Book book) {
        bookDAO.add(book);
    }

}
