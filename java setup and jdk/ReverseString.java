public class ReverseString {
    
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(reverseString("hello")); // Expected output: "olleh"
        System.out.println(reverseString("Java")); // Expected output: "avaJ"
        System.out.println(reverseString("world")); // Expected output: "dlrow"
        System.out.println(reverseString("12345")); // Expected output: "54321"
        System.out.println(reverseString("")); // Expected output: ""
    }
}
