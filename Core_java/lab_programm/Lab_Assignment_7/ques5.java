package Class.Lab_Assignment_7;

import java.util.Scanner;

public class ques5 {

    public static void main(String[] args) throws ques5.CheckArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the arguments: ");
        String[] arguments = new String[4];
        for (int i = 0; i < arguments.length; i++) {
            arguments[i] = scanner.next();
        }
        if (arguments.length < 4) {
            throw new CheckArgumentException("Number of arguments should be at least 4");
        }
        int sumOfSquares = 0;
        for (String argument : arguments) {
            int number = Integer.parseInt(argument);
            sumOfSquares += number * number;
        }
        System.out.println(sumOfSquares);
    }

    private static class CheckArgumentException extends Exception {

        public CheckArgumentException(String message) {
            super(message);
        }
    }
}