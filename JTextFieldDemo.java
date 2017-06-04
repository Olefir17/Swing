package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anastasia on 03.12.2016.
 */
public class JTextFieldDemo {
    public JTextFieldDemo() {
        JFrame jFrame = new JFrame("This is textField Demo");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLayout(new FlowLayout());

        JTextField jTextField = new JTextField(14);

        jTextField.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             jTextField.getText();
         }
        });

        jFrame.add(jTextField);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTextFieldDemo();
            }
        });
    }
    }
