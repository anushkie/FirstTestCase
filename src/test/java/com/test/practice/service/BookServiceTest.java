package com.test.practice.service;

import com.test.practice.dao.BookDAO;
import com.test.practice.entity.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    private BookDAO bookDAO; //This is the dependency,
    // so we will mock it because we dont want to use this
    // rather we will mock its behaviour

    private List<Book> booksToReturn;

    private BookService bookService;

    @Before
    public void setUp() {
        bookDAO = mock(BookDAO.class);
        booksToReturn = new ArrayList<Book>();
        booksToReturn.add(new Book("Anushka"));

        bookService = new BookService(bookDAO);

        when(bookDAO.getAll()).thenReturn(booksToReturn);
    }

    @Test
    public void getAllTest() {
        List<Book> books = bookService.getAll();

        assertEquals(1, books.size());
        assertEquals("Anushka", books.get(0).getName());
    }

    @Test
    public void addBookTest() {
        Book bookToAdd = new Book("Anushka");

        bookService.addBook(bookToAdd);

        verify(bookDAO, times(1)).add(bookToAdd);
    }

}