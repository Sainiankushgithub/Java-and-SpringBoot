package Class.Lab_Assignment_1;
import java.util.*;
/**
 * ques3
 */
public class ques3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Enter the number to get the week of the day");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
            {
                System.out.println("Monday");
                break;
            }
            case 2:
            {
                System.out.println("Tuesday");
                break;
            }
            case 3:
            {
                System.out.println("Wednesday");
                break;
            }
            case 4:
            {
                System.out.println("Thrusday");
                break;
            }
            case 5:
            {
                System.out.println("Friday");
                break;
            }
            case 6:
            {
                System.out.println("Saturday");
                break;
            }
            case 7:
            {
                System.out.println("Sunday");
                break;
            }
            default:
            {
            System.out.println("Invalid entry");
                break;
            }
        }
        sc.close();
    }
}