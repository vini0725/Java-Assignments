public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    
    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
            "radar",
            "level",
            "hello",
            "A man, a plan, a canal, Panama",
            "12321"
        };

        for (String testCase : testCases) {
            System.out.println(testCase + " is a palindrome: " + isPalindrome(testCase));
        }
    }
}
