package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Anastasia on 03.12.2016.
 */
public class JCheckBoxDemo implements ItemListener {
    JFrame jFrame ;
    JLabel jLabel;
    JCheckBox checkBox;

    public JCheckBoxDemo()  {
       jFrame=new JFrame("hello");
       jFrame.setSize(400,500);
       jFrame.setLayout(new FlowLayout());
       jFrame.setDefaultCloseOperation(3);

       checkBox = new JCheckBox("C");
       checkBox.addItemListener(this);
       jFrame.add(checkBox);

        checkBox = new JCheckBox("C++");
        checkBox.addItemListener(this);
        jFrame.add(checkBox);

        checkBox = new JCheckBox("Java");
        checkBox.addItemListener(this);
        jFrame.add(checkBox);

        checkBox = new JCheckBox("Perl");
        checkBox.addItemListener(this);
        jFrame.add(checkBox);

        jLabel= new JLabel("Select language");
        jFrame.add(jLabel);

        jFrame.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        checkBox = (JCheckBox) e.getItem();

        if(checkBox.isSelected()) jLabel.setText(checkBox.getText() + "selected");
        else jLabel.setText(checkBox.getText() + "cleared");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JCheckBoxDemo();
            }
        });
    }

}
