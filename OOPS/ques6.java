package OOPS;
class Cylinder
{
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

    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
    public double surfaceArea()
    {
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
}
public class ques6 {
    public static void main(String[] args) {


        //  PROBLEM NUMBER 1 


        Cylinder c=new Cylinder();
        c.setradius(9);
        System.out.println("Radius : "+c.getradius());
        c.setheight(12);
        System.out.println("Height : "+c.getheight());

        // PROBLEM NUMBER 2  


        System.out.println("Surface Area of a cylinder : "+c.surfaceArea());
        System.out.println("Volume of a Cylinder : "+c.volume());
    }
}
