package Java_Course;
import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=new String("Ankush");
        String s2=new String("ankush");
//        COMPARING IT FIRST BY REFERNCES
        System.out.println("OPERATOR S1==S2:");

        if(s1==s2)
        {
            System.out.println("same Refernces");
        }
        else {
            System.out.println("Different References  ");
        }

        System.out.println("\n S1.equals(S2)");
//        COMPARING THE TWO STRING BY THEIR CONTENT
        if(s1.equals(s2))
        {
            System.out.println("Content inside the both the string are same ");
        }
        else
        {
            System.out.println("Different Content");
        }
        System.out.println("\n s1.equalsIgnoreCase(s2) :");
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Content inside the both the string are same ");
        }
        else
        {
            System.out.println("Different Content");
        }
        String s3="Ankush";
        String s4="Ankush";
        if (s4==s3)
        {
            System.out.println(" s3 and s4 has the same References ");
        }
        else
        {
            System.out.println("They don't have the same References ");
        }
        System.out.println("Concatenating the two strings "+s1.concat(s2));

//        USING THE TRIM ()
        String s5="     Ankush saini     ";
        System.out.println("Without Trim : "+s5);
        System.out.println("Trim () : "+s5.trim());

//        ANOTHER WAY OF CONCATENATE

        String s6="Anku ";
//        s6.concat("Saini");    // output only Anku
        s6=s6.concat("Saini"); // Output  Anku saini here we changed the reference
        System.out.println(s6);

        System.out.println("\n Displaying the pattern using character array and string ");
        char []s7={'a','b','c'};
        String s8=new String("abc");
        System.out.println("s7 :- "+s7);
        System.out.println("s8 :- "+s8);
    }
}

