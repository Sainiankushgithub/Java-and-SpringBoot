package Java_Course;
import java.util.*;
public class Arraybound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        try
        {
            System.out.println("Enter the Array Elements ");
            {
                for(int i=0;i<arr.length;i++)
                {
                    arr[i]=sc.nextInt();
                }
            }
            System.out.println("Displaying arrays Elements :");
            for(int i=0;i<=arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException Ae)
        {
            System.out.println("ArrayOutOfBoundInddex " );
            Ae.printStackTrace();
        }
    }
}
