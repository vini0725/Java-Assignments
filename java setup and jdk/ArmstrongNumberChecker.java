public class ArmstrongNumberChecker {

    public static boolean isArmstrongNumber(int number) {
        int numDigits = String.valueOf(number).length();
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; 
            sum += Math.pow(digit, numDigits);
            number /= 10; 
        }
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int[] testCases = {153, 370, 371, 9474, 123};
        for (int num : testCases) {
            System.out.println(num + " is Armstrong? " + isArmstrongNumber(num));
        }
    }
}
