import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFirstFrame1 extends JFrame implements ActionListener
{
    Container c;
    JButton btn1,btn2,btn3;
    MyFirstFrame1()
    {
        c=this.getContentPane();
        c.setLayout(null);
        btn1 =new JButton("RED");
        btn2 =new JButton("YELLOW");
        btn3 =new JButton("PINK");
        btn1.setBounds(100,100,100,50);
        c.add(btn1);
        btn2.setBounds(250,100,100,50);
        c.add(btn2);
        btn3.setBounds(400, 100, 100, 50);
        c.add(btn3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            c.setBackground(Color.RED);
        }
        else if(e.getSource()==btn2)
        {
            c.setBackground(Color.YELLOW);
        }
        else
        {
            c.setBackground(Color.pink);
        }
    }
}
public class MultipleButton {
    public static void main(String[] args) {
        MyFirstFrame1 f=new MyFirstFrame1();
        f.setSize(500, 500);
        f.setLocation(100, 50);
        f.setTitle("My first frame");
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
