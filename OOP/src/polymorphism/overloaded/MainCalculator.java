package polymorphism.overloaded;

public class MainCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sum(3, 5, 10);
        calculator.sum(3, 5, 10.3);
        calculator.sum(3, 5.0, 1);
    }
}
