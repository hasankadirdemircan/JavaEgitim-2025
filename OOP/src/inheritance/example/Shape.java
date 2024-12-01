package inheritance.example;

public class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    void draw() {
        System.out.println("Drawing a shape");
    }

    double calculateArea() {
        return 0.0;
    }
}
