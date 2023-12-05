package Class.Lab_Assignment_9;

import javax.swing.*;
import java.awt.*;

public class ques1 extends JFrame {
    public ques1() {
        setTitle("Registration Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressTextArea = new JTextArea();
        JCheckBox subscribeCheckBox = new JCheckBox("Subscribe to newsletter");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JButton submitButton = new JButton("Submit");
        ImageIcon icon = new ImageIcon("path/to/your/image.jpg");
        JLabel imageLabel = new JLabel(icon);
        setLayout(new GridLayout(7, 2));
        add(nameLabel);
        add(nameTextField);

        add(addressLabel);
        add(addressTextArea);
        add(subscribeCheckBox);
        add(new JLabel("Gender:"));
        add(maleRadioButton);
        add(new JLabel());
        add(femaleRadioButton);
        add(submitButton);
        add(new JLabel());
        add(imageLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ques1());
    }
}

