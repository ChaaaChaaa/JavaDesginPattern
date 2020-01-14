package OCP;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3.0);
        Shape rectangle = new Rectangle(2.0, 2.0);

        System.out.println("circle: " + circle.calculateArea());
        System.out.println("rectangle: " + rectangle.calculateArea());

    }
}
