package Class;
import java.util.*;
/**
 * ques5
 */
public class ques5 
{
    public static void main(String[] args) {
        String name1,name2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First Name");
        name1=sc.nextLine();
        System.out.println("Enter your second Name");
        name2=sc.nextLine();
        System.out.println("Previous Name : "+name1+" "+name2);
        System.out.println("After changing : "+name2+" "+name1);
        sc.close();
    }
}
