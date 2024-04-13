import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        int principal = scanner.nextInt();

        System.out.print("Enter the annual interest rate (in percentage): ");
        int annualInterestRate = scanner.nextInt();

        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();

        int simpleInterest = (principal * annualInterestRate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

    }
}
