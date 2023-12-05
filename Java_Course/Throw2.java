package Java_Course;

import java.util.Scanner;

class NegativeNumberException extends RuntimeException
{
    NegativeNumberException(String msg)
    {
        super(msg);
    }
}
public class Throw2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        try
        {
            if(num<0)
            {
                throw new NegativeNumberException("Number should be positive  : ");
            }
            else
            {
                double db=num*2.0;
                System.out.println("Doubled value : "+db);
            }
        }
        catch(NegativeNumberException e)
        {
            System.out.println("Exception caught \n Exception occured : "+e);
        }
        finally
        {
            System.out.println("Successfully executed : ");
        }
    }
}
