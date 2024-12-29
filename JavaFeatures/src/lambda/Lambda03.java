package lambda;

@FunctionalInterface
interface LambdaFunctionWithMoreParameters{
    void sum(int number1, int number2);
}

public class Lambda03 {

    public static void main(String[] args) {
        LambdaFunctionWithMoreParameters lambdaFunctionWithMoreParameters = (number1, number2) -> System.out.println("sum is : " + (number1 + number2));
        LambdaFunctionWithMoreParameters lambdaFunctionWithMoreParameters1 = (int number1, int number2) -> System.out.println("sum is : " + (number1 + number2));
        LambdaFunctionWithMoreParameters lambdaFunctionWithMoreParameters2 = (number1, number2) -> {
            System.out.println("sum is : " + (number1 + number2));
        };


        lambdaFunctionWithMoreParameters2.sum(3, 5);
    }
}
