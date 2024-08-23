import java.util.*;
interface  Manager
{
   void earning();
   void deduction();

}
class Substaff implements Manager
{
   int basic_salary;
   float DA;
   float HRA;
   float PF;
   Substaff(int basic_salary)
   {
      this.basic_salary=basic_salary;
      DA=(float)(0.8*basic_salary) ;
      HRA=(float)(0.15*basic_salary);
      PF=(float)(.12*basic_salary);
   }
   @Override
   public void earning() {
      float earning;
      earning=(float)(basic_salary+DA+HRA);
      System.out.println("Earning : "+earning);
   }

   @Override
   public void deduction() {
      float deduction;
      deduction=PF;
      System.out.println("Deduction : "+deduction);
   }
   void bonus()
   {
      System.out.println("Bonus : "+(float)(0.5*basic_salary));
   }
}
public class ques3 {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int basic_salary;
      System.out.println("Enter the basic salary : ");
      basic_salary=sc.nextInt();
      Substaff s=new Substaff(basic_salary);
      System.out.println("Basic salary : "+basic_salary);
      s.earning();
      s.deduction();
      s.bonus();
      sc.close();
   }
}
