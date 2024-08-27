package Class.Lab_Asssignment_3;

import java.util.Scanner;

class Subs
{
    int Substraction(int a,int b)
    {
        return a-b;
    }
    double Substraction(double a, double b)
    {
        return a-b;
    }
    double Substraction(int a,double b)
    {
        return a-b;
    }
    double Substraction(double a,int b)
    {
        return a-b;
    }
}
public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Subs s=new Subs();
        System.out.println(" Method overloading Substraction");

        //  METHOD OVERLOAD BOTH INTEGER
        System.out.println("Substraction with Both integer is : "+s.Substraction(12,10));

        //  METHOD OVERLOAD WITH BOTH DOUBLE
        System.out.println("Substraction with Both Double is : "+s.Substraction(23.23,10.23)); 

        // METHOD OVERLOAD WITH ONE INTEGER AND ONE DOUBLE 
        System.out.println("Substraction with one integer and double is : "+s.Substraction(46,35.45));

        // METHOD OVERLOAD WITH ONE DOUBLE AND ONE INTEGER 
        System.out.println("Substraction with one double and integer is : "+s.Substraction(46.67,35));
        sc.close();
    }
}
