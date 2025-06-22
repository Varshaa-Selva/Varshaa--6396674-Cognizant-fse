
public class Main {
    public static void main(String[] args) {
        double initialValue = 10000; // starting money
        double growthRate = 0.10; // 10% annual growth
        int years = 5;

        System.out.println("Recursive Forecast:");
        double result1 = Forecast.predictValueRecursive(initialValue, growthRate, years);
        System.out.printf("Predicted Value after %d years: ₹%.2f\n", years, result1);

        System.out.println("\nOptimized Forecast:");
        double result2 = Forecast.predictValueOptimized(initialValue, growthRate, years);
        System.out.printf("Predicted Value after %d years: ₹%.2f\n", years, result2);
    }
}
