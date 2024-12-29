package lambda;

@FunctionalInterface
interface LambdaCalculator{
    int process(int number1, int number2);
}

public class Lambda04 {

    public static void main(String[] args) {
        LambdaCalculator lambdaCalculator = (number1, number2) -> number1 + number2;
        LambdaCalculator lambdaCalculator1 = (int number1, int number2) -> number1 + number2;
        LambdaCalculator lambdaCalculator2 = (number1, number2) -> {
            return number1 + number2;
        };


        System.out.println("sum is : " + lambdaCalculator.process(4, 6));
    }
}
