package basics.j4_robot_visual.ui;

import basics.j4_robot_visual.Robot;
import basics.j4_robot_visual.RobotLine;

import javax.swing.*;
import java.awt.*;

public class RobotPathComponent extends JComponent {
    private Robot robot;

    public RobotPathComponent(Robot robot) {
        this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Перебираем все линии, которые сохранились у робота
        for (RobotLine r : robot.getLines()) {
            int x1 = (int) Math.round(r.getX1());
            int y1 = (int) Math.round(r.getY1());
            int x2 = (int) Math.round(r.getX2());
            int y2 = (int) Math.round(r.getY2());
            // И рисуем линию с координатами
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
