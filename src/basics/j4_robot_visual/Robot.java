package basics.j4_robot_visual;

import java.util.ArrayList;

public class Robot
{
    private double x = 0;
    private double y = 0;
    protected double course = 0;
    // Список для хранения линий, по которым перемещался робот
    private ArrayList<RobotLine> lines = new ArrayList<RobotLine>();

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Передвижение на дистанцию distance
    public void forward(int distance) {
        //Запоминаем координаты перед перемещением
        final double xOld = x;
        final double yOld = y;
        //меняем координаты
        x = x + distance * Math.cos(course / 180 * Math.PI);
        y = y + distance * Math.sin(course / 180 * Math.PI);
        // Запоминаем координаты пройденного пути в списке
        // Класс List позволяет добавить объект и хранить его
        lines.add(new RobotLine(xOld, yOld, x, y));
    }

    // Печать координат робота
    public void printCoordinates() {
        System.out.println(x + "," + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public ArrayList<RobotLine> getLines() {
        return lines;
    }
}
