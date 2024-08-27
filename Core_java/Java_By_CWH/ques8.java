
//  GUESS THE NUMBER GAME 

package Java_By_CWH;
import java.util.*;
public class ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int rand_int=rand.nextInt(1,101);
        int choice;
        System.out.println("Enter the number between 1 and 100 to check with computer number ");
        while(true)
        {
            choice=sc.nextInt();
            if(choice==rand_int)
            {
                System.out.println(" \t\t!!!!!!!  HURRAH  !!!!!!");
                System.out.println("You won \n\tYou guess Right");
                System.out.println("Computer number was "+rand_int);
                break;
            }
            else if(choice>rand_int)
            {
                System.out.println("Enter the number less than "+choice);
            }
            else
            {
                System.out.println("Enter the number greator than "+choice);
            }
        }
        sc.close();
    }
}
