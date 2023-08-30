package OOPS;

class Constructor {


    // DEFAULT CONSTRUCTOR
    
    String Name;
    int roll_no;
    Constructor()
    {

    }
    void display()
    {
        System.out.println("Name : "+Name);
        System.out.println("Roll number : "+roll_no);
    }
    public static void main(String[] args) {
        Constructor cn=new Constructor();
        cn.display();
    }
}
