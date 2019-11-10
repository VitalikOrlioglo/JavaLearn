package basics.j3_oop.j33_polymorphie;

import javax.swing.*;
import java.awt.*;

public class RectangleComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
        g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
