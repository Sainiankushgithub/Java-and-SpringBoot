
package com.tech.blog.dao;
import com.tech.blog.entities.user;
import java.sql.*;
public class userDao {
    private Connection con;

    public userDao(Connection con) {
        this.con=con;
    }
    
//    method to insert user to data base
    
    public boolean saveUser(user USER){
        boolean f=false;
        try{
            
            String query="insert into USER(name,email,password,gender,about) values(?,?,?,?,?)";
            PreparedStatement pst=this.con.prepareStatement(query);
            pst.setString(1, USER.getName());
            pst.setString(2, USER.getEmail());
            pst.setString(3, USER.getPassword());
            pst.setString(4, USER.getGender());
            pst.setString(5, USER.getAbout());
            pst.executeUpdate();
            f=true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    // get user by userEmail & password
    public user getUserByEmailAndPassword(String email,String password)
    {
        user USER=null;
        try{
            String query="select * from user where email=? and password=?";
            PreparedStatement psmt=con.prepareStatement(query);
            psmt.setString(1, email);
            psmt.setString(2, password);
            ResultSet set=psmt.executeQuery();
            
            if(set.next()){
                USER=new user();
//                data from database
                String  name=set.getString("name");
                USER.setName(name);
                
                USER.setId(set.getInt("id"));
                USER.setEmail(set.getString("email"));
                USER.setPassword(set.getString("password"));
                USER.setAbout(set.getString("about"));
                USER.setProfile(set.getString("profile"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return USER;
    }
            
}
