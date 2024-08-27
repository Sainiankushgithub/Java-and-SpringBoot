package Class.Lab_Assignment_9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ques2 extends JFrame {
    private JTextField firstNumberField, secondNumberField, resultField;

    public ques2() {
        setTitle("Simple Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel firstNumberLabel = new JLabel("Enter the First Number:");
        JLabel secondNumberLabel = new JLabel("Enter the Second Number:");
        JLabel resultLabel = new JLabel("Result:");
        firstNumberField = new JTextField();
        secondNumberField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);
        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton resetButton = new JButton("Reset");
        setLayout(new GridLayout(5, 2));
        add(firstNumberLabel);
        add(firstNumberField);

        add(secondNumberLabel);
        add(secondNumberField);

        add(resultLabel);
        add(resultField);

        add(addButton);
        add(subButton);
        add(multiplyButton);
        add(resetButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("add");
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("sub");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("multiply");
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFields();
            }
        });
        setVisible(true);
    }

    private void performOperation(String operation) {
        try {
            double num1 = Double.parseDouble(firstNumberField.getText());
            double num2 = Double.parseDouble(secondNumberField.getText());
            double result = 0;

            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "sub":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
            }

            resultField.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    }

    private void resetFields() {
        firstNumberField.setText("");
        secondNumberField.setText("");
        resultField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ques2());
    }
}

