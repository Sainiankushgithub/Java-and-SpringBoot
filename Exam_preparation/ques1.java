package Exam_preparation;
// class Student
// {
//     int age;
//     int roll_no;
//     Student(Student s2)
//     {
//         this.age=s2.age;
//         this.roll_no=s2.roll_no;
//     }
//     Student()
//     {

//     }
//     void display()
//     {
//         System.out.println("Age is : "+age);
//         System.out.println("Roll_no: "+roll_no);
//     }
// }
class Student
{
    int age;
    String name;
    int roll_no;
    // DEFAULT CONSTRUCTOR 

    Student()
    {
        System.out.println("Default Constructor ");
    }

    // PARAMETERIZED CONSTRUCTOR 

    Student(int age,String name,int roll_no)
    {
        this.age=age;
        this.name=name;
        this.roll_no=roll_no;
    }

// COPY CONSTRUCTOR 

    Student (Student s)
    {
        this.age=s.age;
        this.name=s.name;
        this.roll_no=s.roll_no;
    }
    void display()
    {
        System.out.println("Age : "+age);
        System.out.println("Name : "+name);
        System.out.println("Roll_no : "+roll_no);
    }
}
public class ques1 {
    public static void main(String[] args) {
        // Student s1=new Student();
        // s1.age=23;
        // s1.roll_no=2206409;
        // Student s2=new Student(s1);
        // s2.display();
        // s1.display();
        Student s= new Student();
        Student s1=new Student(12, "Ankush", 2206409);
        s1.display();
        Student s2=new Student(s1);
        s2.display();
    }
}
