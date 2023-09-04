// STRING METHOD IN JAVA 

package Java_By_CWH;
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter your name ");
        name=sc.nextLine();
        System.out.print("Name : "+name+"\n");

        //  LENGTH OF STRING 

        System.out.print("Length : "+name.length()+"\n");

        // toLowerCase 

        System.out.println("Converting your string into lower case : "+name.toLowerCase());

        // toUpperCase 

        System.out.println("Converting your string into lower case : "+name.toUpperCase());

        // substring 

        System.out.println("Printing the sub string : "+name.substring(2));

        System.out.println("Printing the sub string : "+name.substring(2, 4));
        sc.close();
    }
}
