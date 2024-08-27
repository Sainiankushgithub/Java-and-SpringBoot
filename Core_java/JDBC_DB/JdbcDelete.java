import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcDelete {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name whose data you want to delete");
        String name=sc.nextLine();
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_DB","root","Ankushsaini");
        PreparedStatement ps=con.prepareStatement("DELETE FROM register WHERE name=?");
        
        ps.setString(1,name);
        int i=ps.executeUpdate();
        if(i>0)
        {
            System.out.println("Deleted SuccessFully");
        }
        else
        {
            System.out.println("Fail tO delete");
        }
        con.close();
        sc.close();
    }
}
