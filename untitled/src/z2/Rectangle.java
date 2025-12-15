public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new RuntimeException("Фигуры не существует!");
        }
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
}