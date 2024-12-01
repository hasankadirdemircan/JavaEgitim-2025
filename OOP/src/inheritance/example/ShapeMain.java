package inheritance.example;

public class ShapeMain {

    public static void main(String[] args) {
        Circle circle = new Circle("yellow", 2);
        Rectangle rectangle = new Rectangle("red", 5, 7);
        Triangle triangle = new Triangle("blue", 5, 10);

        circle.draw();
        System.out.println(circle.calculateArea());

        rectangle.draw();
        System.out.println(rectangle.calculateArea());

        triangle.draw();
        System.out.println(triangle.calculateArea());
    }
}
