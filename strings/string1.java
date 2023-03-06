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
         * 3.--> NonTrimmedString
         * 4.--> trim
         * 5.-->
         */
        System.out.println("Displaying the length of your string : ");
        System.out.println(str.length());
        String lstr = str;
        System.out.println("Converting the upper case elements into lower case elements : ");
        System.out.print(lstr.toLowerCase());
        String ustr = str;
        System.out.println("\nConverting the lower case elements into lower case elements : ");
        System.out.print(ustr.toUpperCase());

        System.out.println("\nNon trimmed string ");
        String nonTrimmedString = "             Ankush saini";
        System.out.println(nonTrimmedString);
        System.out.println("Differnce using the trim in nontrimmedString");
        String trim = nonTrimmedString.trim();
        System.out.println(trim);
        in.close();
    }
}