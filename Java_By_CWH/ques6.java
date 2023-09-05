
// ACCESS MODIFIERS ///// GETTERS AND SETTERS IN JAVA

package Java_By_CWH;
import java.util.*;
class Employee
{
    private String name;
    private int id;
    private int Salary;

    void SetFun(String Name,int Id ,int salary)
    {
        this.name=Name;
        this.id=Id;
        this.Salary=salary;
    }
    void getfun()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Salary : "+Salary);
    }
}
public class ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int id,salary;
        System.out.println("Enter Employee name ");
        name=sc.nextLine();
        System.out.println("Enter your ID number ");
        id=sc.nextInt();
        System.out.println("Enter your salary ");
        salary=sc.nextInt();
        Employee e=new Employee();
        e.SetFun(name, id, salary);
        e.getfun();
        sc.close();
    }
}
