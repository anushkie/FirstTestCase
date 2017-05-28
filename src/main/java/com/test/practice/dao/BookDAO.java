package com.test.practice.dao;

import com.test.practice.entity.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BookDAO {

    public List<Book> getAll() {
        return Arrays.asList(new Book("Book 1"),
                new Book("Book 2"));
    }

    public Optional<Book> getByName(String name) {
        return getAll().stream()
                .filter(x -> x.getName().equals(name))
                .findFirst();
    }

    public void add(Book book) {
        //do something with the book
    }

}
