// Main.java
public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(105, "Mouse", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(103, "Book", "Stationery"),
                new Product(102, "Laptop", "Electronics")
        };

        int searchId = 103;

        System.out.println("Linear Search:");
        Product result1 = SearchFunctions.linearSearch(products, searchId);
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found.");

        System.out.println("\nBinary Search:");
        SearchFunctions.sortByProductId(products); // Must sort before binary search
        Product result2 = SearchFunctions.binarySearch(products, searchId);
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found.");
    }
}
