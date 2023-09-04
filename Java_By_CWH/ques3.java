//     ARRAYS IN JAVA 

package Java_By_CWH;
import java.util.*;
public class ques3 {
    static void display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of your array ");
        n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter your array elements ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Displaying your arrays elemnts ");
        display(arr,n);
        sc.close();
    }
}
