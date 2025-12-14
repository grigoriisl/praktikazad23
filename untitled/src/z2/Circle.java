public class Circle {
    private double radius;
    private static final double PI = 3.1415;
    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Фигуры не существует!");
        }
        this.radius = radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * PI * radius;
    }
    public double getRadius() {
        return radius;
    }
}