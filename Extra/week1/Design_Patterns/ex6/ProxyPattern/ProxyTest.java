public class ProxyTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("nature1.jpg");
        Image img2 = new ProxyImage("nature2.jpg");

        System.out.println("\nFirst time display:");
        img1.display(); // Loads and displays
        System.out.println("\nSecond time display:");
        img1.display(); // Displays directly from cache

        System.out.println("\nNow displaying second image:");
        img2.display(); // Loads and displays
    }
}
