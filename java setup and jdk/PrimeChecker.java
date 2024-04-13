public class PrimeChecker {

    // Method to check if a number is prime or not
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test Cases
        System.out.println(isPrime(2));  // Expected output: true
        System.out.println(isPrime(7));  // Expected output: true
        System.out.println(isPrime(12)); // Expected output: false
        System.out.println(isPrime(23)); // Expected output: true
        System.out.println(isPrime(29)); // Expected output: true
    }
}
