package basics.j3_oop.j31_incapsulation_inheritance;

public class RobotExt extends Robot
{
    public RobotExt(double x, double y, double course) {
        super(x, y);
        this.course = course;
    }

    public void back(int distance) {
        forward(-distance);
    }
}
