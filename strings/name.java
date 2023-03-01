package Java.strings;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        // String name = new String("Ankush saini");

        // WE CAN USE USE THIS WAY TOO

        // String name = "ANKUSH SAINI";
        // System.out.println(name);

        // TAKING INPUT FROM THE USER

        Scanner in = new Scanner(System.in);
        String ch;
        System.out.println("Enter your name");
        ch = in.nextLine();
        System.out.println("Displaying your name");
        System.out.println(ch);
        in.close();
    }

}