package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Anastasia on 30.11.2016.
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });
    }
}
class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame() throws HeadlessException {
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
