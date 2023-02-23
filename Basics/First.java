package Java.Basics;

import java.util.Scanner;

/**
 * basic
 */
public class First {

    public static void main(String[] args) {
        System.out.println("Hello,world");

        // THIS WITHOUT TAKING THE INPUT FROM THE USER

        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;
        System.out.print("Sum of two number is ");
        System.out.println(sum);

        // NOW TAKING THE INPUT FROM THE USER

        System.out.println("Taking the input from the user");
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the first number");
        // float a = in.nextFloat();
        // System.out.println("Eenter the second number");
        // float b = in.nextFloat();
        // System.out.print("sum=");
        // float add = a + b;
        // System.out.print(add);
        // System.out.println();
        // System.out.println("To check whether given input is int or not");
        // boolean b1 = in.hasNextInt();
        // System.out.println(b1);
        // in.nextLine();
        System.out.println("Enter your String");
        String str = in.nextLine();
        System.out.println("Your string is ");
        System.out.print(str);
        in.close();
    }
}