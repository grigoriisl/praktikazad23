public class Main {
    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(5, 3);
            System.out.println("Прямоугольник (длина=" + rectangle.getLength() + ", ширина=" + rectangle.getWidth() + ")");
            System.out.println("Площадь: " + rectangle.getArea());
            System.out.println("Периметр: " + rectangle.getPerimeter());
            System.out.println();
            Circle circle = new Circle(4);
            System.out.println("Круг (радиус=" + circle.getRadius() + ")");
            System.out.println("Площадь: " + circle.getArea());
            System.out.println("Периметр: " + circle.getPerimeter());
            System.out.println();
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Треугольник (стороны: " + triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC() + ")");
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println();
            try {
                Rectangle invalidRect = new Rectangle(-2, 5);
            } catch (RuntimeException e) {
                System.out.println("Caught: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}