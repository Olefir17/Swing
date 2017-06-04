package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anastasia on 03.12.2016.
 */
public class JComboBoxDemo {
    JFrame jFrame;
    JComboBox<String > jComboBox ;
    String flags[]={"France","Cermany","Italy","Japan"};
    JLabel jLabel = new JLabel();
    ImageIcon france = new ImageIcon("D:\\настя\\october\\src\\Swing\\flag.gif");
    ImageIcon germany;
    ImageIcon italy = new ImageIcon("italy.gif");
    ImageIcon japan = new ImageIcon("D:\\настя\\october\\src\\Swing\\japan.gif");

    public JComboBoxDemo(){
        jFrame = new JFrame("ComboBox");
        jFrame.setSize(400,400);
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(3);


        jComboBox = new JComboBox<>(flags);

        jLabel = new JLabel(new ImageIcon("japan"));
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) jComboBox.getSelectedItem();
                jLabel.setIcon(new ImageIcon(s +".gif"));
            }
        });
        jFrame.add(jComboBox);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JComboBoxDemo();
            }
        });
    }

}
