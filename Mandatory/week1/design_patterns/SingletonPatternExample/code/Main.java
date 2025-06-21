public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Logging 1st msg");

        Logger logger2 = Logger.getInstance();
        logger2.log("Logging 2nd msg");

        if (logger1 == logger2) {
            System.out.println("Both instance are same.");
        } else {
            System.out.println("Different instance exists!");
        }
    }
}
