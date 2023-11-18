package Java_Course;

// import java.io.FileInputStream;
import java.util.Scanner;

public class Democompile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter the vallue of a ");
            int a=sc.nextInt();
            System.out.println("Enter the vallue of b ");
            int b=sc.nextInt();
            int result=a/b;
            System.out.println("Result : "+result);
            // FileInputStream f=new FileInputStream("d:/abc.txt");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Successfull Execution By Compile Time ");
        sc.close();
    }
}
