import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the email");
        String email=sc.nextLine();
        System.out.println("Enter the password");
        String password=sc.nextLine();
        System.out.println("Enter the gender");
        String gender=sc.nextLine();
        System.out.println("Enter the city");
        String city=sc.nextLine();
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_DB","root","Ankushsaini55@@");
//        PreparedStatement ps=con.prepareStatement("INSERT INTO register VALUES ('"+name+"','"+email+"','"+password+"','"+gender+"','"+city+"') ");
//        ANOTHER WAY OF PUTTING THE VALUES IN MY SQL
        PreparedStatement ps=con.prepareStatement("INSERT INTO register VALUES (?,?,?,?,?)");
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,password);
        ps.setString(4,gender);
        ps.setString(5,city);
        int i=ps.executeUpdate();
        if(i>0)
        {
            System.out.println("Success ");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}