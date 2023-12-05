package Class.Lab_Assignment_2;

import java.util.Scanner;

public class ques3 {
    static void display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void Sorting(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of your array ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Displaying your array elements before sorting ");
        display(arr, n);
        Sorting(arr,n);
        System.out.println("Displaying your elements after sorting ");
        display(arr, n);
        sc.close();
    }
}
