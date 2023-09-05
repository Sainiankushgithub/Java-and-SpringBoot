package Java_By_CWH;
import java.util.*;
class Base
{
    public int x;
    public void setx(int X)
    {
        System.out.println("I'm setting the x ");
        x=X;
    }
    public int getx()
    {
        return x;
    }
}
class Derived extends Base
{
    public int y;
    public void sety(int Y)
    {
        System.out.println("I'm Setting the y ");
        y=Y;
    }
    public int gety()
    {
        return y;
    }
}
public class ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Base I=new Base();
        I.setx(43);
        System.out.println(I.getx());

        //  DERIVED CLASS 

        Derived d=new Derived();
        d.sety(23);
        System.out.println(d.gety());


        // CALLING BASE CLASS FROM THE DERIVED CLASS 
         
        d.setx(45);
        System.out.println(d.getx());
        sc.close();
    }
}
