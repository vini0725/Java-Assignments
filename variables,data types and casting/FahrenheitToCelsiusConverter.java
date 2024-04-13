public class FahrenheitToCelsiusConverter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        // Test cases
        double[] testCases = {32.0, 68.0, 100.0, 212.0, 50.0};
        
        System.out.println("Fahrenheit to Celsius Converter");
        for (double testCase : testCases) {
            System.out.println(testCase + " Fahrenheit = " + fahrenheitToCelsius(testCase) + " Celsius");
        }
    }
}
