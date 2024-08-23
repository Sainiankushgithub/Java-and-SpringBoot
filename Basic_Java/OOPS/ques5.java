package OOPS;
import java.util.*;
class Const {

    String Name;
    int roll_no;
    String Section;
    int age;

    //  PARAMETERIZED CONSTRUCTOR 

    Const(String Name,int roll_no,String Section,int age)
    {
        this.Name=Name;
        this.roll_no=roll_no;
        this.Section=Section;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name : "+Name);
        System.out.println("Roll number : "+roll_no);
        System.out.println("Section : "+Section);
        System.out.println("Age : "+age);
    }
    public static void main(String[] args) {
        String name;
        int roll_no;
        String Section;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        name=sc.nextLine();
        System.out.println("Enter your roll number : ");
        roll_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Section : ");
        Section=sc.nextLine();
        System.out.println("Enter your age : ");
        age=sc.nextInt();
        Const cn=new Const(name,roll_no,Section,age);
        cn.display();
        sc.close();
    }
}
