package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Created by Anastasia on 03.12.2016.
 */
public class JListDemo  {
    JFrame jFrame = new JFrame();
    JLabel jLabel;
    JScrollPane scrollPane;
    JList<String> jl;
    String Cities[] = {"Киев", "Луганск", "Москва", "Ужгород", "Минск", "Винница", "Донецк"};

    public JListDemo() {
        jFrame.setSize(588,566);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLayout(new FlowLayout());

        jl=new JList<String>(Cities);
        jl.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        scrollPane=new JScrollPane(jl);
        scrollPane.setPreferredSize(new Dimension(120,90));
        jFrame.add(scrollPane);
        jLabel=new JLabel("Choose a city");
        jl.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int idx = jl.getSelectedIndex();
                if(idx!=-1) jLabel.setText("Текущий выбор "+ Cities[idx]);
                else jLabel.setText("Choose a city");
            }
        });

        jFrame.add(jLabel);
       // jFrame.add(jl);
        jFrame.setVisible(true);

            }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JListDemo();
            }
        });
    }
}
