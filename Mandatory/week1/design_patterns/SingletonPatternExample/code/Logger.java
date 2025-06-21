public class Logger {
    private static Logger instance;

    // Private constructor prevents instantiation from other classes
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
