package polymorphism.overloaded;

public class MathOperations {

    int add(int a, int b) {
        System.out.println("int a, int b");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("double a, double b");
        return a + b;
    }

    double add(double a, int b) {
        System.out.println("double a, int b");
        return a + b;
    }

    double add(int a, double b) {
        System.out.println("int a, double b");
        return  a + b;
    }

}
