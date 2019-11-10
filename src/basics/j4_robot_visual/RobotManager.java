package basics.j4_robot_visual;

import basics.j4_robot_visual.ui.RobotFrame;

import javax.swing.*;

public class RobotManager {
    public static void main(String[] args) {
        // Количество сторон многоугольника
        final int COUNT = 12;
        // Длина стороны
        final int SIDE = 100;

        Robot robot = new Robot(300, 100);
        // Создаем замкнутую фигуру с количеством углов COUNT
        for (int i = 0; i < COUNT; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 360 / COUNT);
        }
        // Создаем форму для отрисовки пути нашего робота
        RobotFrame robotFrame = new RobotFrame(robot);
        robotFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        robotFrame.setVisible(true);
    }
}
