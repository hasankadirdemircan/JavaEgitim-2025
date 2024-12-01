package inheritance.example;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    double calculateArea() {
     //   return Math.PI * radius * radius;
        return Math.PI * Math.pow(radius, 2);
    }
}
