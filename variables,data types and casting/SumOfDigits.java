public class SumOfDigits {
    public static int sumDigits(int num) {
        num = Math.abs(num);        
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return sumDigits(sum);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumDigits(38));   // Expected output: 2
        System.out.println(sumDigits(123));  // Expected output: 6
        System.out.println(sumDigits(999));  // Expected output: 9
        System.out.println(sumDigits(8765)); // Expected output: 8
        System.out.println(sumDigits(0));    // Expected output: 0
    }
}
