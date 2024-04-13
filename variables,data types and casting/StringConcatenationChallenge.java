public class StringConcatenationChallenge {
    
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        // Test cases
        String result1 = concatenateStrings("Hello", "World");
        System.out.println(result1); // Expected output: "HelloWorld"
        
        String result2 = concatenateStrings("", "Concatenate");
        System.out.println(result2); // Expected output: "Concatenate"
        
        String result3 = concatenateStrings("Java", "");
        System.out.println(result3); // Expected output: "Java"
        
        String result4 = concatenateStrings("Good", "Morning");
        System.out.println(result4); // Expected output: "GoodMorning"
        
        String result5 = concatenateStrings("Concatenate", "Strings");
        System.out.println(result5); // Expected output: "ConcatenateStrings"
    }
}
