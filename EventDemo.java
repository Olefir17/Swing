package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anastasia on 03.12.2016.
 */
public class EventDemo {
    JLabel jLabel;
    EventDemo(){
        JFrame jFrame = new JFrame("An event example");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(300,100);
        jFrame.setDefaultCloseOperation(3);

        JButton jBbtAlpha = new JButton("Alpha");
        JButton jBbtBeta = new JButton("Beta");

        jBbtAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Alpha was pressed");
            }
        });

        jBbtBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Beta was pressed");
            }
        });

        jFrame.add(jBbtAlpha);
        jFrame.add(jBbtBeta);

        jLabel = new JLabel("Press a label");
        jFrame.add(jLabel);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}
