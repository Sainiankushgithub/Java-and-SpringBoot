package Java_Course;
import java.util.*;
public class Stringbound {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name ");
        String x=sc.nextLine();
        try
        {
            for(int i=0;i<x.length()-1;i++)
            {
                System.out.println(x[i]);
            }
        }
        catch(StringIndexOutOfBoundsException Se)
        {
           System.out.println("Exception caught ");
        }
    }
}
