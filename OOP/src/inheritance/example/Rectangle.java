package inheritance.example;

public class Rectangle extends Shape {

   private double width;
   private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}
