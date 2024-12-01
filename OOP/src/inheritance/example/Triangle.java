package inheritance.example;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
