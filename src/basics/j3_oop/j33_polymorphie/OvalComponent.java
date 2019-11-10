package basics.j3_oop.j33_polymorphie;

import javax.swing.*;
import java.awt.*;

public class OvalComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
        g.drawOval(5, 5, getWidth()-10, getHeight()-10);
    }
}
