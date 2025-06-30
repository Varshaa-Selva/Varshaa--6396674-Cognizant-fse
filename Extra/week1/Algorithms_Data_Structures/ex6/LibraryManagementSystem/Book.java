public class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "Book ID: " + bookId + ", Title: \"" + title + "\", Author: " + author;
    }
}
// This class represents a book in the library management system.
// It contains the book ID, title, and author.
