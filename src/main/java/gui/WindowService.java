package gui;

import javax.swing.*;
import java.awt.*;

public class WindowService {
    public void createWindow() {
        var frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setMinimumSize(new Dimension(300, 400));
        frame.setVisible(true);
    }
}
