import java.util.Scanner;
public class ThrowExceptionAge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("Checking . . . Are You Eligible for Club ?");
        try{
            if (age <= 18) {
                throw new RuntimeException("You are not Eligible");
            }
            System.out.println("ohhh hooo welcome to club . . . .");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
