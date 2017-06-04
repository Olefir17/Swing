package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anastasia on 03.12.2016.
 */
public class JRadioButtonDemo implements ActionListener {
    JFrame jFrame;
    JLabel jLabel;

    public JRadioButtonDemo() {
        jFrame = new JFrame("RadioButton");
        jFrame.setDefaultCloseOperation(3);
        jFrame.setSize(400,500);
        jFrame.setLayout(new FlowLayout());

        JRadioButton b1 = new JRadioButton("A");
        b1.addActionListener(this);
        jFrame.add(b1);

        JRadioButton b2 = new JRadioButton("B");
        b2.addActionListener(this);
        jFrame.add(b2);

        JRadioButton b3 = new JRadioButton("C");
        b3.addActionListener(this);
        jFrame.add(b3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(b1);
        buttonGroup.add(b2);
        buttonGroup.add(b3);


        jLabel = new JLabel("Select one");
        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jLabel.setText("You selected "+e.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JRadioButtonDemo();
            }
        });
    }
    }
