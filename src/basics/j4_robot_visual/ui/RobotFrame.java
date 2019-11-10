package basics.j4_robot_visual.ui;

import basics.j4_robot_visual.Robot;

import javax.swing.*;

public class RobotFrame extends JFrame {
    public RobotFrame(Robot robot) {
        // Устанавливаем заголовок окна
        setTitle("Robot Frame");
        // Добавляем компонент для рисования пути робота
        add(new RobotPathComponent(robot));
        // Устанавливаем размеры окна
        setBounds(100, 100, 1000, 1000);
    }
}
