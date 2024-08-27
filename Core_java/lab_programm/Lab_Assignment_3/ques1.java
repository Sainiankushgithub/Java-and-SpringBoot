package Class.Lab_Assignment_3;
import java.util.*;
class File_box
{
    int length,breadth,height;
    void Demo(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    void volume()
    {
        System.out.println("Volume : "+(length*breadth*height));
    }
}
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l,b,h;
        System.out.println("Enter the length : ");
        l=sc.nextInt();
        System.out.println("Enter the breadth : ");
        b=sc.nextInt();
        System.out.println("Enter the height : ");
        h=sc.nextInt();
        File_box fb=new File_box();
        fb.Demo(l, b, h);
        fb.volume();
        sc.close();
    }
}
