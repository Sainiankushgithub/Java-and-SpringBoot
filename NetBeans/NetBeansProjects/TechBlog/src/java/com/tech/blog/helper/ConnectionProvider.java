
package com.tech.blog.helper;
import java.sql.*;
public class ConnectionProvider {
    public static Connection con;
    public static Connection getConnection()
    {
        try
        {
            // Driver class load
              if(con==null){
                  Class.forName("com.mysql.jdbc.Driver");
                  
                  // create a connection ......
                  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog","root","Ankush");
              }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
