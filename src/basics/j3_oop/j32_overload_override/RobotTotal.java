package basics.j3_oop.j32_overload_override;

public class RobotTotal extends Robot
{
    // Вводим поле дляхранения пройденной дистанции
    private double totalDistance = 0;

    // перегруженный конструктор
    public RobotTotal() {
        super(0, 0);
    }
    
    // Конструктор тоже надо переопределить
    public RobotTotal(double x, double y) {
        super(x, y);
    }

    @Override
    public void forward(int distance) {
        // Вызов нашего метода у класса предка.
        // Нужно указать зарезервированное слово super
        System.out.println("RobotTotal");
        super.forward(distance);
        totalDistance += distance;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}
