public class IntegerToStringConversion {

    public static String intToString(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        boolean isNegative = num < 0;
        num = Math.abs(num);

        while (num > 0) {
            int digit = num % 10;
            sb.insert(0, (char)('0' + digit));
            num /= 10;
        }

        if (isNegative) {
            sb.insert(0, '-');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] testCases = {123, -456, 0, 789, -987};
        for (int num : testCases) {
            System.out.println("Integer: " + num + ", String: " + intToString(num));
        }
    }
}
