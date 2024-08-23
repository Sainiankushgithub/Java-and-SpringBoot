package Class.Lab_Asssignment_3;
import java.util.*;
class Rectangle
{
    int area;
    int length,breadth;
    Rectangle()
    {
        System.out.println("Default constructor area :  ");
        length=0;
        breadth=0;
    }
    Rectangle(int l,int b)
    {
        System.out.println("Paramertrized constructor area :  ");
        length=l;
        breadth=b;
        area=l*b;
    }
    void display()
    {
        System.out.println("Area of rectangle is : "+area);
    }
}
public class ques6 {
    public static void main(String[] args) {
        int len,width;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of a rectangle : ");
        len=sc.nextInt();
        System.out.println("Enter the width of a rectangle : ");
        width=sc.nextInt();

        // Default Constructor 

        Rectangle re=new Rectangle();
        re.display();

        // Paramertrized Constructor
        Rectangle r=new Rectangle(len, width);
        r.display();
        sc.close();
    }
}
