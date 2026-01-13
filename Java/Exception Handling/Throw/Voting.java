import java.util.Scanner;

class YoungAgeException extends RuntimeException{
    YoungAgeException(String msg){
        super(msg);
    }
}
public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("Checking that are you eligible for voting ? . . . ");
        if(age <=18){
            throw new YoungAgeException("You are not Eligible !");
        }else{
            System.out.println("you can vote . . . ");
        }
    }
}
