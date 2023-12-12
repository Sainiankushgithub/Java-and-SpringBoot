import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFirstFrame extends JFrame implements ActionListener
{
    Container c;
    JButton btn;
    MyFirstFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);
        btn=new JButton("Click me");
        btn.setBounds(100,100,100,50);
        c.add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        c.setBackground(Color.pink);
    }
}
public class Button1 {
    public static void main(String[] args) {
        MyFirstFrame f=new MyFirstFrame();
        f.setTitle("My First Frame");
        f.setSize(500, 500);
        f.setLocation(100,50);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

