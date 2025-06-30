import java.util.HashMap;
import java.util.Scanner;

public class InventoryManager {
    private static HashMap<String, Product> inventory = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    viewInventory();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // consume newline

        Product p = new Product(id, name, qty, price);
        inventory.put(id, p);
        System.out.println("Product added.");
    }

    private static void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        String id = sc.nextLine();
        Product p = inventory.get(id);
        if (p != null) {
            System.out.print("Enter new quantity: ");
            int qty = sc.nextInt();
            System.out.print("Enter new price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            p.setQuantity(qty);
            p.setPrice(price);
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        String id = sc.nextLine();
        if (inventory.remove(id) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\nInventory:");
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }
}
