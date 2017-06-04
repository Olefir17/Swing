package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Anastasia on 03.12.2016.
 */
public class JTabbedPanelDemo {
    JFrame jFrame = new JFrame("Hello");
    JTabbedPane jTabbedPane =new JTabbedPane();
    JLabel jLabel;

    public JTabbedPanelDemo() {
        jFrame.setSize(500,600);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setVisible(true);


           jTabbedPane.addTab("Cities", new CitiesPanel());
            jTabbedPane.addTab("Colors", new ColorsPanel());
            jTabbedPane.addTab("Flavors", new FlavorsPanel());

            jFrame.add(jTabbedPane);

        }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTabbedPanelDemo();
            }
        });
    }
    }


class CitiesPanel extends JPanel{
    public CitiesPanel() {
        JButton b1 = new JButton("New York");
        add(b1);
        JButton b2 = new JButton("London");
        add(b2);
        JButton b3 = new JButton("Hong Kong");
        add(b3);
        JButton b4 = new JButton("Moscow");
        add(b4);
    }
}
class ColorsPanel extends JPanel{
    public ColorsPanel() {
        JCheckBox cb1 = new JCheckBox("Red");
        add(cb1);
        JCheckBox cb2 = new JCheckBox("Green");
        add(cb2);
        JCheckBox cb3 = new JCheckBox("Blue");
        add(cb3);
    }
}

class FlavorsPanel extends JPanel{
    public FlavorsPanel() {
        JComboBox<String > comboBox = new JComboBox<>();
        comboBox.addItem("Vanilla");
        comboBox.addItem("Chocolate");
        comboBox.addItem("Strawberry");
        add(comboBox);
    }
}


