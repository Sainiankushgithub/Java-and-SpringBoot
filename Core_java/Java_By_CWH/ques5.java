
//   VARIABLE ARGUMNETS (VARARGS) IN JAVA 

package Java_By_CWH;

import java.util.Scanner;

public class ques5 {
    static int sum(int ...arr)
    {
        int result=0;
        for(int a:arr)
        {
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a=sc.nextInt();
        System.out.println("Enter the value of b ");
        b=sc.nextInt();
        System.out.println("Sum of a and b is : "+sum(a,b));
        System.out.println("Enter the value of x , y and z ");
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        System.out.println("Sum of x y and z is : "+sum(x,y,z));
        sc.close();
    }
}
