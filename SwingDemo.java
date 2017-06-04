package Swing;

import javax.swing.*;

/**
 * Created by Anastasia on 03.12.2016.
 */
public class SwingDemo {
    SwingDemo(){
        JFrame jfrm = new JFrame("A simple swing application");
        jfrm.setSize(300,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Swing means powerful GUIs");

        jfrm.add(jlab);
        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
