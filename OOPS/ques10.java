package OOPS;

//   Abstract classes 


abstract class Parent1
{
    public Parent1()
    {
        System.out.println("I am the constructor of Parent class : ");
    }
    public void SayHello()
    {
        System.out.println("Hello Good Afternoon : ");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child1 extends Parent1
{
     public void greet()
    {
        System.out.println("Hello Good Night : ");
    }
    public void greet2()
    {
        System.out.println("Hello Good Afternoon : ");
    }
}
abstract class child2 extends Parent1
{
    public void th()
    {
        System.out.println("I am Good : ");
    }
}

public class ques10 {
    public static void main(String[] args) {


        // Parent1 p=new Parent1();  // ERROR

        Child1 c =new Child1(); 
        c.greet();
        c.greet2();

        c.SayHello();
    }
}
