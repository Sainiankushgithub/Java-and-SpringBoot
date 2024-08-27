package Class.Lab_Assignment_1;
import java.util.*;
class Grade
{
    int marks;
    Grade(int marks)
    {
        this.marks=marks;
    }
    void GradeGot()
    {
        if(marks>=90)
        {
            System.out.println("You got 'O' Grade");
        }
        else if(marks>=80)
        {
            System.out.println("You got 'E' Grade");
        }
        else if(marks>=70)
        {
            System.out.println("You got 'A' Grade");
        }
        else if(marks>=60)
        {
            System.out.println("You got 'B' Grade");
        }
        else if(marks>=50)
        {
            System.out.println("You got 'C' Grade");
        }
        else
        {
            System.out.println("You are failed !!!");
        }
    }
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter your marks ");
        Scanner se=new Scanner(System.in);
        marks=se.nextInt();
        Grade gd=new Grade(marks);
        System.out.println("Displaying your marks you got according to your performance ");
        gd.GradeGot();
        se.close();
    }
}
