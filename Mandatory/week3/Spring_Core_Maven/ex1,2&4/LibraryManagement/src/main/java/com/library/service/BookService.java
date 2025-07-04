package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to display book from repository
    public void displayBookInfo() {
        System.out.println("Book from repository: " + bookRepository.getBookTitle());
    }

    // Method to list hardcoded books
    public void listBooks() {
        System.out.println("Listing available books...");
        System.out.println("1. The Great Gatsby");
        System.out.println("2. 1984 by George Orwell");
        System.out.println("3. Clean Code by Robert C. Martin");
    }
}
