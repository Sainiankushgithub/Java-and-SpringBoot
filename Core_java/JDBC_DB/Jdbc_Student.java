import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc_Student {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id ");
        int id = sc.nextInt();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the name ");
        sc.nextLine();
        String name = sc.nextLine();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/COLLEGE", "root", "Ankushsaini55@@");
        PreparedStatement ps = con.prepareStatement("INSERT INTO Student VALUES (?, ?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);

        int i = ps.executeUpdate();

        if (i > 0) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
