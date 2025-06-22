
public class Forecast {

    // Recursive method to calculate future value
    public static double predictValueRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictValueRecursive(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optimized: Tail Recursion using helper
    public static double predictValueOptimized(double currentValue, double growthRate, int years) {
        return helper(currentValue, growthRate, years);
    }

    private static double helper(double value, double growthRate, int years) {
        if (years == 0)
            return value;
        return helper(value * (1 + growthRate), growthRate, years - 1);
    }
}
