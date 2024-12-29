package lambda;

@FunctionalInterface
interface LambdaFunction {
    void message();
}

public class Lambda01 {
    public static void main(String[] args) {
        LambdaFunction lambdaFunction = () -> System.out.println("hello world!");

        lambdaFunction.message();
    }
}
