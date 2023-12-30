import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcUpdate {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name whose city you want to change");
        String name=sc.nextLine();
        System.out.println("Enter the new city name ");
        String city=sc.nextLine();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_DB","root","Ankushsaini55@@");
        PreparedStatement ps=con.prepareStatement("UPDATE register SET city=? WHERE name=?");
        ps.setString(1,city);
        ps.setString(2,name);
        int i=ps.executeUpdate();
        if(i>0)
        {
            System.out.println("SuccessFully Updated Statement");
        }
        else
        {
            System.out.println("Fail");
        }
        con.close();
        sc.close();
    }
}
