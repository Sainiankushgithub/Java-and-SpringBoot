package com.tech.blog.entities;
import java.sql.*;
import java.security.Timestamp;
public class user {
    private  int id;
    private String name;
    private String email;
    private String password;
    private String about;
    private Timestamp dateTime;
    private String gender;
    private String profile;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    
    public user(int id,String name,String email,String password,String about,Timestamp dateTime,String gender){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.about=about;
        this.dateTime=dateTime;
        this.gender=gender;
    }
    
    public user(){
        
    }
    
    public user(String name,String email,String password,String about,String gender){
        this.name=name;
        this.email=email;
        this.password=password;
        this.about=about;
        this.gender=gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
