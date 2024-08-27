import java.util.*;
abstract class Student
{
    int roll_no;
    int reg_no;
    Student(int roll_no,int reg_no)
    {
        this.roll_no=roll_no;
        this.reg_no=reg_no;
    }
    void getInput()
    {
        System.out.println("Your roll _no is : "+roll_no);
        System.out.println("Your registration number is : "+reg_no);
    }
    abstract void course();
}
class kiitian extends Student
{
    String course;
    kiitian(int roll_no,int reg_no,String course)
    {
        super(roll_no,reg_no);
        this.course=course;
    }
    public void course()
    {
        System.out.println("Your course is : "+course   );
    }
}
public class ques1 {
    public static void main(String[] args) {
        int roll_no,reg_no;
        String course;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your roll_no : ");
        roll_no=sc.nextInt();
        System.out.println("Enter your registration_no : ");
        reg_no=sc.nextInt();
        System.out.println("Enter your course e.g IT,CSE,CSS,EEE,ECS");
        sc.nextLine();
        course=sc.nextLine();
        kiitian k=new kiitian(roll_no,reg_no,course);
        System.out.println("Displaying your data : ");
        k.getInput();
        k.course();
    }
}
