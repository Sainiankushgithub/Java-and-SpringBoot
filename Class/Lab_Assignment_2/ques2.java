package Class.Lab_Assignment_2;
import java.util.*;
public class ques2 {
    static void displayEvenNum(int arr[])
    {
        for(int i=0;i<10;i++)
        {
            if((arr[i])%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
    static void displayOddNum(int arr[])
    {
        for(int i=0;i<10;i++)
        {
            if((arr[i])%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter any 10 elements ");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Dispalying even number of your entered elements ");
        displayEvenNum(arr);
        System.out.println("Dispalying Odd number of your entered elements ");
        displayOddNum(arr);
        sc.close();
    }
}
