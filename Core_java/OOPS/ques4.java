package OOPS;

class Construct {

    String Name;
    int roll_no;
    String Section;
    int age;

    //  USER DEFINED CONSTRUCTOR 

    Construct()
    {
        Name="Ankush saini";
        roll_no=2206409;
        Section="IT - 05";
        age=19;
    }
    void display()
    {
        System.out.println("Name : "+Name);
        System.out.println("Roll number : "+roll_no);
        System.out.println("Section : "+Section);
        System.out.println("Age : "+age);
    }
    public static void main(String[] args) {
        Construct cn=new Construct();
        cn.display();
    }
}
