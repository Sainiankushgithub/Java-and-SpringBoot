package Java_Course;
import java.util.*;
public class Stringbound {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // char []ch={'A','N','K','U','S','H'};
        // try
        // {
        //     System.out.println(ch[5]);
        // }
        // catch(StringIndexOutOfBoundsException Se)
        // {
        //    System.out.println("Exception caught ");
        //    Se.printStackTrace();
        // }
        System.out.println("Enter your String ");
        String str=sc.nextLine();
        try
        {
            System.out.println("Displaying your String ");
            for(int i=0;i<=str.length();i++)
            {
                System.out.println(str.charAt(i));
            }
        }
        catch(StringIndexOutOfBoundsException Se)
        {
            Se.printStackTrace();
        }
        System.out.println("Successfully executed ");
        sc.close();
        
    }
}
