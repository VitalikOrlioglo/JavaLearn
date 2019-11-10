package basics.j3_oop.j32_overload_override;

import basics.j3_oop.j33_polymorphie.ShapeFrame;

import javax.swing.*;

public class ShapeApplication {
    public static void main(String[] args) {
        // Создаем графическое окно
        ShapeFrame shapeFrame = new ShapeFrame();

        // Задаем правило, по которому приложение завершиться при
        // закрытии этой формы
        shapeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Делаем окно видимым
        shapeFrame.setVisible(true);
    }
}
