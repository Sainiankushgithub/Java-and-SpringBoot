package Class.Lab_Assignment_7;

import java.util.Scanner;

public class ques1 {
       public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the numbers: ");
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");
            int[] array = new int[4];

            for (int i = 0; i <= numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }
            scanner.close();
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
