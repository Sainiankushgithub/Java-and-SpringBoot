package Java.strings;

import java.util.Scanner;

/**
 * string1
 */
public class string1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String str = "ANKUSH SAINI";
        // System.out.println("Displaying your string");
        // System.out.print(str);

        // TAKING THE INPUT FROM THE USER

        String str;
        System.out.println("Enter your name");
        str = in.nextLine();
        System.out.println("Displaying your content\n" + str);

        /*
         * SOME OF THE COMMONLY USED STRING METHODS
         * 1.--> name.length (RETURN THE LENGTH OFF THE STRING NAME)
         * 2.--> name.toLowerCase (THIS WILL CONVERT ALL THE UPPER CASE ELEMENTS INTO
         * LOWER CASE)
         * 3.-->
         */
        System.out.println("Displaying the length of your string : ");
        System.out.println(str.length());
        System.out.println("Converting the upper case elements into lower case elements : ");
        System.out.print(str.toLowerCase());
        System.out.println("\nConverting the lower case elements into lower case elements : ");
        System.out.print(str.toUpperCase());
        in.close();
    }
}