package polymorphism.overloaded;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(int a, double b, int c) {
        return a + b + c;
    }

    public double sum(double a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b, double c) {
        return a + b + c;
    }
}
