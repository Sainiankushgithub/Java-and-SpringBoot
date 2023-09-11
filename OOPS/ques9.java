package OOPS;

import java.util.*;

class Phone {
    public void ShowTime() {
        Date current_date = new Date();
        System.out.println("Now time is : " + current_date);
    }

    public void on() {
        System.out.println("Turning on SmartPhone ......... ");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("I am playing music : ");
    }

    public void on() {
        System.out.println("I am turning on SmartPhone .......... ");
    }
}

public class ques9 {
    public static void main(String[] args) {


        // DYNAMIC METHOD DISPATCHED 


        
        SmartPhone smobj = new SmartPhone();
        smobj.ShowTime();

        Phone obj = new SmartPhone();    // ALLOWED
        obj.on();

        // SmartPhone smobj2=new Phone(); // NOT ALLOWED 
    }
}
