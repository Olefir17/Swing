package Swing;

import javax.swing.*;

/**
 * Created by Anastasia on 03.12.2016.
 */
public class JLabelDemo {
    JLabelDemo() {
        JFrame jFrame = new JFrame("This is flag");
        jFrame.setSize(600, 500);
        ImageIcon imageIcon = new ImageIcon("D:\\настя\\october\\src\\Swing\\flag.gif");
        JLabel jLabel = new JLabel("France", imageIcon, JLabel.LEFT);
        jFrame.add(jLabel);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JLabelDemo();
            }
        });
    }


}
