public class StringToIntegerConversion {

    public static int stringToInteger(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int result = 0;
        int sign = 1;
        int i = 0;

        // Check for sign
        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        while (i < str.length()) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                int digit = c - '0';
                result = result * 10 + digit;
                i++;
            } else {
                break;
            }
        }

        return result * sign;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(stringToInteger("123"));   // Expected: 123
        System.out.println(stringToInteger("-456"));  // Expected: -456
        System.out.println(stringToInteger("7890"));  // Expected: 7890
        System.out.println(stringToInteger("+42"));   // Expected: 42
        System.out.println(stringToInteger("-"));     // Expected: 0
    }
}
