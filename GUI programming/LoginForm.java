import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowStateListener;

class Form extends JFrame
{
    Container c;
    JButton btn;
    JLabel label1,label2;
    JTextField user;
    JPasswordField pass;
    Form()
    {
        c=this.getContentPane();
        c.setLayout(null);
        this.setTitle("Login Form");
        this.setSize(500, 500);
        this.setLocation(100, 50);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        label1 =new JLabel("user name : ");
        label1.setBounds(10,50,120,20);
        c.add(label1);
        user=new JTextField();
        user.setBounds(120,50,120,20);
        c.add(user);
        label2 =new JLabel("Password : ");
        label2.setBounds(10,150,120,20);
        c.add(label2);
        pass=new JPasswordField();
        pass.setBounds(120,150,120,20);
        pass.setEchoChar('*');
        c.add(pass);
        btn=new JButton("Login");
        btn.setBounds(20,300,100,50);
        c.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("user name : "+user.getText());
                System.out.println("Password  : "+pass.getPassword());
            }
        });
        this.setVisible(true);
    }
}
public class LoginForm {
    public static void main(String[] args) {
        Form f=new Form();
    }
}
