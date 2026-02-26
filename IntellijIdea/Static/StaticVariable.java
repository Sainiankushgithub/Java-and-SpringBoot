class Student{
    // 'college' is static to avoid duplicate copies and ensure the same college value is shared across all Student objects
    static String college="KIIT";
    String name;
    int roll_no;
    Student(String name ,int roll_no){
        this.name = name;
        this.roll_no=roll_no;
    }
    public void display(){
        System.out.println();
        System.out.println("Name : "+name);
        System.out.println("College : "+college);
        System.out.println("Roll no : "+roll_no);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student("Ankush saini",2206409);
        s1.display();

        Student s2 = new Student("Ayush sharma",2206408);
        s2.display();

        Student s3 = new Student("Shivam Yadav",2306345);
        s3.display();
    }
}
