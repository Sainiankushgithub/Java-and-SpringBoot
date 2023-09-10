package OOPS;
class Cylinder
{
    // GETTER AND SETTER 

    private int radius;
    private int height;
    public void setradius(int radius)
    {
        this.radius=radius;
    }
    public void setheight(int height)
    {
        this.height=height;
    }
    public int getradius()
    {
        return radius;
    }
    public int getheight()
    {
        return height;
    }
}
public class ques6 {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setradius(12);
        System.out.println("Radius : "+c.getradius());
        c.setheight(34);
        System.out.println("Height : "+c.getheight());
    }
}
