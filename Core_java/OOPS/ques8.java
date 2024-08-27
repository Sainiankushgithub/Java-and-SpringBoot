package OOPS;
class A
{
    public void method1()
    {
        System.out.println("I am method1 of class A :  ");
    }
    public void method2()
    {
        System.out.println("I am method2 of class A : ");
    }
}
class B extends A
{

    // METHOD OVERRIDDEN 

    
    public void method2()
    {
        System.out.println("I am method2 of class B : ");
    }
    public void method3()
    {
        System.out.println("I am method 3 of class B ");
    }
}
public class ques8 {
    public static void main(String[] args) {
        A a=new A();
        a.method1();
        B b=new B();
        b.method2();
    }
}
