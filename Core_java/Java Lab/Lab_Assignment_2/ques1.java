package Class.Lab_Assignment_2;
import java.util.*;
/**
 * ques1
 */
public class ques1 {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int arr[]=new int[3];
       System.out.println("Enter the three elements to check whether which one is greator ");
       for(int i=0;i<3;i++)
       {
        arr[i]=sc.nextInt();
       }
       int res=arr[0];
       for(int i=1;i<3;i++)
       {
        if(res< arr[i])
        {
            res=arr[i];
        }
       }
       System.out.println("Greator number among three elements is  : "+res);
       sc.close();
    }
}