package Java_Course;

import java.util.Scanner;

class YoungerAgeExecption extends RuntimeException
{
    YoungerAgeExecption(String msg)
    {
        super(msg);
    }
}
public class Throw1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        try
        {
            if(age<18)
        {
            throw new YoungerAgeExecption("You are not eligible for voting :");
        }
        else
        {
            System.out.println("You can vote successfully :");
        }
        }
        catch(YoungerAgeExecption e)
        {
            e.printStackTrace();
        }
        System.out.println("Throw exception handle successfully :");
    }
}
