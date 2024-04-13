public class CelsiusToFahrenheitConverter {
    
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1: " + celsiusToFahrenheit(0));    // Expected: 32.0
        System.out.println("Test Case 2: " + celsiusToFahrenheit(100));  // Expected: 212.0
        System.out.println("Test Case 3: " + celsiusToFahrenheit(-40)); // Expected: -40.0
        System.out.println("Test Case 4: " + celsiusToFahrenheit(37));   // Expected: 98.6
        System.out.println("Test Case 5: " + celsiusToFahrenheit(25.5)); // Expected: 77.9
    }
}
