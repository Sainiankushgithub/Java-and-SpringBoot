
/*  -Implement a GUI application which consists of one List Box and one
button. The list box will have four different color names. When the user will select a color from
the list box and click on the button, the panel color will be changed to that color. */
package Class.Lab_Assignment_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ques3 extends JFrame {
    private JPanel colorPanel;
    private JList<String> colorList;
    private JButton changeColorButton;

    public ques3() {
        // Set frame properties
        setTitle("Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        colorList = new JList<>(colors);
        changeColorButton = new JButton("Change Color");

        // Set layout
        setLayout(new BorderLayout());

        // Add components to the frame
        add(colorPanel, BorderLayout.CENTER);
        add(colorList, BorderLayout.WEST);
        add(changeColorButton, BorderLayout.SOUTH);

        // Add action listener to the button
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changePanelColor();
            }
        });

        // Set visibility
        setVisible(true);
    }

    private void changePanelColor() {
        String selectedColor = colorList.getSelectedValue();

        if (selectedColor != null) {
            switch (selectedColor) {
                case "Red":
                    colorPanel.setBackground(Color.RED);
                    break;
                case "Green":
                    colorPanel.setBackground(Color.GREEN);
                    break;
                case "Blue":
                    colorPanel.setBackground(Color.BLUE);
                    break;
                case "Yellow":
                    colorPanel.setBackground(Color.YELLOW);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ques3());
    }
}

