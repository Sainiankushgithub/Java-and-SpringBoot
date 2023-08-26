package Class;

class Student
{
    String name;
    int roll_no;
    String section;
    String Branch;
    Student(String name,int roll_no,String section,String Branch)
    {
        this.name=name;
        this.roll_no=roll_no;
        this.section=section;
        this.Branch=Branch;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll number : "+roll_no);
        System.out.println("Section : "+section);
        System.out.println("Branch : "+Branch);
    }
    public static void main(String[] args) {
        Student st =new Student("Ankush saini", 2206409, "IT-5", "Information Technology");
        st.display();
    }
}
