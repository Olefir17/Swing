package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anastasia on 03.12.2016.
 */
public class JButtonDemo implements ActionListener {
    JLabel label;
    public JButtonDemo(){

        JFrame jFrame = new JFrame();
        jFrame.setSize(220,90);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLayout(new FlowLayout());

        ImageIcon france = new ImageIcon("D:\\настя\\october\\src\\Swing\\flag.gif");
        JButton jb1 = new JButton(france);
        jb1.setActionCommand("France");
        jb1.addActionListener(this);
        jFrame.add(jb1);

        ImageIcon italy = new ImageIcon("D:\\настя\\october\\src\\Swing\\italy.gif");
        JButton jb2 = new JButton(italy);
        jb2.setActionCommand("Italy");
        jb2.addActionListener(this);
        jFrame.add(jb2);

        ImageIcon japan = new ImageIcon("D:\\настя\\october\\src\\Swing\\japan.gif");
        JButton jb3 = new JButton(japan);
        jb3.setActionCommand("Japan");
        jb3.addActionListener(this);
        jFrame.add(jb3);
        label = new JLabel("Choose");
        jFrame.add(label);


        jFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        label.setText("You selected"+e.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JButtonDemo();
            }
        });
    }

}
