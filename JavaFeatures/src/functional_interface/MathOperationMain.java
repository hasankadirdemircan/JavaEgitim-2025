package functional_interface;

public class MathOperationMain {

    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;

        MathOperation subtraction = (int a, int b) -> a - b;

        MathOperation multiplication = (a, b) -> a * b;

        MathOperation division = (a, b) -> a / b;

        System.out.println("addition : " + operate(10, 5, addition));
        System.out.println("subtraction : " + operate(10, 5, subtraction));
        System.out.println("multiplication : " + operate(10, 5, multiplication));
        System.out.println("division : " + operate(10, 5, division));
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }
}
