package Java_By_CWH;
import java.util.*;
class Base1
{
    Base1()
    {
        System.out.println("I'm Base class constructor ");
    }
    Base1(int x)
    {
        System.out.println("I'm constructor with  x value as : "+x);
    }
    void display()
    {
        System.out.println("Displayed all the material ");
    }
}
class Derived1 extends Base1
{
    Derived1()
    {
        // super(12);
        System.out.println("I'm Derived class constructor");
    }
    Derived1(int x,int y)
    {
        super(x);
        System.out.println("I'm overloaded Constructor with value of y as : "+y);
    }
}
class childDerived1 extends Derived1
{
    childDerived1()
    {
        System.out.println("I'm childderived constructor ");
    }
    childDerived1(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I'm childDerived overloaded constructor with the value of z as : "+z);
    }
}
public class ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Base1 b=new Base1();
        // Derived1 d=new Derived1();
        // Derived1 d=new Derived1(14, 23);

        // childDerived1 cd=new childDerived1();

        childDerived1 cd=new childDerived1(12, 23, 34);
        cd.display();
        sc.close();
    }
}
