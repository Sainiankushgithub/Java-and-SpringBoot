// MAKING SIMPLE CALCULATOR USING JAVA PROGRAMM
package Java.Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("HII THIS IS YOUR SIMPLE CALCULATOR");
        System.out.println(
                "\t\tEnter + for ADDITION\n\t\tEnter - for SUBTRACTION\n\t\tEnter * for MULTIPLICATION\n\t\tEnter / for DIVISION");
        System.out.println("Enter the choice");
        char ch;
        ch = in.next().charAt(0);
        switch (ch) {
            case '+': {
                System.out.println("Enter the first and second number");
                double n1, n2;
                n1 = in.nextDouble();
                n2 = in.nextDouble();
                System.out.println("Addition of two number is " + (n1 + n2));
                break;
            }
            case '-': {
                System.out.println("Enter the first and second number");
                double n1, n2;
                n1 = in.nextDouble();
                n2 = in.nextDouble();
                System.out.println("Subtraction of two number is " + (n1 - n2));
                break;
            }
            case '*': {
                System.out.println("Enter the first and second number");
                double n1, n2;
                n1 = in.nextDouble();
                n2 = in.nextDouble();
                System.out.println("Multiplication of two number is " + (n1 * n2));
                break;
            }
            case '/': {
                System.out.println("Enter the first and second number");
                double n1, n2;
                n1 = in.nextDouble();
                n2 = in.nextDouble();
                System.out.println("Division of two number is " + (n1 / n2));
                break;
            }
            default: {
                System.out.println("You have entered INVLAID ENTRY!!!!!!");
                break;
            }
        }
        in.close();
    }

}
