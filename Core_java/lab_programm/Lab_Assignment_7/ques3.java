package Class.Lab_Assignment_7;

import java.util.Scanner;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
public class ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        try {
            ProcessInput(number);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception\nException occurred: " + e);
        }
        scanner.close();
    }
    public static void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number should be positive");
        } 
        else {
            double doubleValue = number * 2.0;
            System.out.println("Double value: " + doubleValue);
        }
    }
}

