package Java_Course;

import java.util.*;

public class DemoException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a, b, result;
            System.out.println("Enter the values of a and b ");
            a = sc.nextInt();
            b = sc.nextInt();
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide the number by zero because it's infinity ");
        }
    }
}
