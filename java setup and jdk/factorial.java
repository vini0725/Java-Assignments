public class factorial {
    public static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {5, 0, 1, 10, 3};
        for (int n : testCases) {
            System.out.println("Factorial of " + n + " is: " + calculateFactorial(n));
        }
    }
}
