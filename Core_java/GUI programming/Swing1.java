import javax.swing.*;
import java.awt.*;

public class Swing1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My First Frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(200, 100, 500, 500);
        frame.setResizable(true);
        Container c = frame.getContentPane();
        c.setLayout(new GridLayout(2, 2, 2, 2)); // 2 rows, 2 columns, with gaps

        // User Name components
        JLabel label = new JLabel("User name : ");
        Font font = new Font("Italic", Font.ITALIC, 20);
        label.setFont(font);
        JTextField t1 = new JTextField(15);

        // Password components
        JLabel label1 = new JLabel("Password:");
        Font font1= new Font("Italic",Font.ITALIC,20);
        label1.setFont(font1);
        JPasswordField pass = new JPasswordField(15);
        pass.setEchoChar('*');
        pass.setEchoChar((char)0);
        // Add components in the desired sequence
        c.add(label);
        c.add(t1);
        c.add(label1);
        c.add(pass);

        frame.setVisible(true);
    }
}
