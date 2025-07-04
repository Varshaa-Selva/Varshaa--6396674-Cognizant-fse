package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        System.out.println("BookService: Calling repository...");
        bookRepository.getBookList();
    }
}
// This class is responsible for business logic related to books.
// It uses the BookRepository to fetch the list of books.