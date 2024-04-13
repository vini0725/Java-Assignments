public class DivisionWithRemainder {
    
    public static int[] divideWithRemainder(int dividend, int divisor) {
        if (divisor == 0) {
            System.out.println("Error: Division by zero");
            return new int[]{-1, -1}; // Return error values
        }
        
        int quotient = dividend / divisor; // Calculate quotient
        int remainder = dividend % divisor; // Calculate remainder
        
        return new int[]{quotient, remainder}; // Return both quotient and remainder
    }
    
    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
            {10, 3},
            {20, 5},
            {17, 3},
            {50, 7},
            {12, 4}
        };
        
        for (int[] testCase : testCases) {
            int dividend = testCase[0];
            int divisor = testCase[1];
            int[] result = divideWithRemainder(dividend, divisor);
            System.out.println("Dividend: " + dividend + ", Divisor: " + divisor + ", Quotient: " + result[0] + ", Remainder: " + result[1]);
        }
    }
}
