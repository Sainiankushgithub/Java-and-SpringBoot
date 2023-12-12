import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyCalculator extends JFrame
{
    Container c;
    JLabel label1,label2,result;
    JTextField t1,t2;
    JButton add,sub,mult,div;
   MyCalculator(){
       this.setTitle("Calculator");
       this.setSize(700, 500);
       this.setLocation(100, 50);
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       c=this.getContentPane();
       c.setLayout(null);
       label1 =new JLabel("First number : ");
       label1.setBounds(10,50,120,20);
       c.add(label1);
       t1=new JTextField();
       t1.setBounds(120,50,120,20);
       c.add(t1);
       label2=new JLabel("Second number : ");
       label2.setBounds(10,150,120,20);
       c.add(label2);
       t2=new JTextField();
       t2.setBounds(120, 150, 120, 20);
       c.add(t2);

       add=new JButton("ADD");
       add.setBounds(10,300,100,20);
       c.add(add);
       sub=new JButton("SUB");
       sub.setBounds(120,300,100,20);
       c.add(sub);
       mult=new JButton("MUL");
       mult.setBounds(240,300,100,20);
       c.add(mult);
       div=new JButton("DIV");
       div.setBounds(360, 300, 100, 20);
       c.add(div);
       result =new JLabel("Result : ");
       result.setBounds(10,350,300,20);
       c.add(result);
       add.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              try
              {
                  double a=Double.parseDouble(t1.getText());
                  double b= Double.parseDouble(t2.getText());
                  result.setText("Result : "+(a+b));
              }
              catch(NumberFormatException e1)
              {
                      result.setText("Please Enter the Integer value only");
              }
           }
       });
       sub.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               try
               {
                   double a=Double.parseDouble(t1.getText());
                   double b= Double.parseDouble(t2.getText());
                   result.setText("Result : "+(a-b));
               }
               catch(NumberFormatException e2)
               {
                   result.setText("Please Enter the Integer value only");
               }
           }
       });
       mult.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               try
               {
                   double a=Double.parseDouble(t1.getText());
                   double b= Double.parseDouble(t2.getText());
                   result.setText("Result : "+(a*b));
               }
               catch(NumberFormatException e3)
               {
                   result.setText("Please Enter the Integer value only");
               }
           }
       });
       div.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               try
               {
                   double a=Double.parseDouble(t1.getText());
                   double b= Double.parseDouble(t2.getText());
                   result.setText("Result : "+(a/b));
               }
               catch(Exception e4)
               {
                   result.setText("Please Enter the Integer value only");
               }
           }
       });
       this.setVisible(true);
   }
}
public class Calculator {
    public static void main(String[] args) {
        MyCalculator cal= new MyCalculator();
    }
}
