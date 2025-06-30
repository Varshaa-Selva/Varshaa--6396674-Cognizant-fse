public class OrderSorter {

    public static void main(String[] args) {
        Order[] orders = {
                new Order("O101", "Alice", 500.0),
                new Order("O102", "Bob", 150.0),
                new Order("O103", "Charlie", 700.0),
                new Order("O104", "Diana", 300.0)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        System.out.println("\nSorted by Bubble Sort:");
        bubbleSort(orders.clone());

        System.out.println("\nSorted by Quick Sort:");
        quickSort(orders.clone(), 0, orders.length - 1);
        printOrders(orders);
    }

    // ---------------- Bubble Sort ----------------
    public static void bubbleSort(Order[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getTotalPrice() > arr[j + 1].getTotalPrice()) {
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printOrders(arr);
    }

    // ---------------- Quick Sort ----------------
    public static void quickSort(Order[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(Order[] arr, int low, int high) {
        double pivot = arr[high].getTotalPrice();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].getTotalPrice() <= pivot) {
                i++;
                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printOrders(Order[] arr) {
        for (Order o : arr) {
            System.out.println(o);
        }
    }
}
