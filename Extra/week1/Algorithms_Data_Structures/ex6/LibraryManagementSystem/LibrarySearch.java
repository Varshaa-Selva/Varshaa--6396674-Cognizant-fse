import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearch {

    static Book[] books = {
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "Pride and Prejudice", "Jane Austen"),
            new Book(5, "Moby Dick", "Herman Melville")
    };

    public static void main(String[] args) {
        System.out.println("Linear Search Result:");
        linearSearch("1984");

        System.out.println("\nBinary Search Result:");
        binarySearch("1984");
    }

    // Linear Search
    public static void linearSearch(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Binary Search
    public static void binarySearch(String title) {
        // Sort books by title first
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);

            if (cmp == 0) {
                System.out.println("Found: " + books[mid]);
                return;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Book not found.");
    }
}
