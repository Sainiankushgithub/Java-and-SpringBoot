package Class.Lab_Assignment_7;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();
            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch block: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            scanner.close(); 
        }
    }
}
