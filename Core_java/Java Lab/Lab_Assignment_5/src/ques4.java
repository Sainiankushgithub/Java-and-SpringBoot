import java.util.*;
interface Employee
{
    void getDetail();
}
interface manager extends Employee
{
    void getDepDetail();
}
class Head implements manager
{
    int EmpId,DeptId;
    String EmpName,DeptName;
    Head(int EmpID,int DeptId,String EmpName,String DeptName)
    {
        this.EmpId=EmpID;
        this.EmpName=EmpName;
        this.DeptId=DeptId;
        this.DeptName=DeptName;
    }
    @Override
    public void getDepDetail() {
        System.out.println("Department Id : "+DeptId);
        System.out.println("Department Name : "+DeptName);
    }

    @Override
    public void getDetail() {
        System.out.println("Employee Id : "+EmpId);
        System.out.println("Employee Name : "+EmpName);
    }
}
public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int EmpId,DeptId;
        String EmpName,DeptName;
        System.out.println("Enter Id of the Employee : ");
        EmpId=sc.nextInt();
        System.out.println("Enter the name of the Employee : ");
        sc.nextLine();
        EmpName=sc.nextLine();
        System.out.println("Enter the department ID : ");
        DeptId=sc.nextInt();
        System.out.println("Enter the department name : ");
        sc.nextLine();
        DeptName=sc.nextLine();
        Head h=new Head(EmpId,DeptId,EmpName,DeptName);
        h.getDetail();
        h.getDepDetail();
        sc.close();
    }
}
