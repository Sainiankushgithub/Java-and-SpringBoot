// import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Jdbc_Select {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_DB","root","Ankushsaini55@@");
        PreparedStatement ps=con.prepareStatement("SELECT * FROM register");
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            System.out.println("Name : "+rs.getString("name"));
            System.out.println("Email : "+rs.getString("email"));
            System.out.println("Password : "+rs.getString("password"));
            System.out.println("gender : "+rs.getString("gender"));
            System.out.println("city : "+rs.getString("city"));
            System.out.println("------------------------------------------------------");
        }
    }
}
