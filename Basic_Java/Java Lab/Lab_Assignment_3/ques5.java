package Class.Lab_Asssignment_3;
import java.util.*;
class Area
{
    float radius;
    int base,height,side;
    float area;
    Area(float r)
    {
        radius=r;
        area=(float)(2*3.14*r*r);
    }
    Area(int b,int h)
    {
        base=b;
        height=h;
        area=(float)(0.5*base*height);
    }
    Area(int s)
    {
        side=s;
        area=s*s;
    }
    void display(int choice)
    {
        if(choice==1)
        {
            System.out.println("Area of circle is : "+area);
        }
        else if(choice==2)
        {
            System.out.println("Area of triangle is : "+area);
        }
        else
        {
            System.out.println("Area of square is : "+area);
        }
    }
}
public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What would you want to find ");
        System.out.println("Press 1 for area of circle \n Press 2 for area of triangle \n Press 3 for area of square ");
        int choice;
        do{
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                float radius;
                System.out.println("Enter the radius of circle ");
                radius=sc.nextFloat();
                Area a=new Area(radius);
                a.display(choice);
                break;
                }
                case 2:
                {
                    int base,height;
                    System.out.println("Enter the base and height of a triangle ");
                    base=sc.nextInt();
                    height=sc.nextInt();
                    Area a=new Area(base,height);
                    a.display(choice);
                    break;
                }
                case 3:
                {
                    int side;
                    System.out.println("Enter the side of Square ");
                    side=sc.nextInt();
                    Area a=new Area(side);
                    a.display(choice);
                    break;
                }
                case 4:
                {
                    break;
                }
                default :
                {
                    System.out.println("Invalid entry ");
                }
            }
        }while(choice!=4);
        sc.close();
    }
}
