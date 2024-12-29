package lambda;

@FunctionalInterface
interface LambdaFunctionWithParameter{
    void message(String msg);
}

public class Lambda02 {
    public static void main(String[] args) {
        LambdaFunctionWithParameter lambdaFunctionWithParameter = msg -> System.out.println("message is : " + msg);

        LambdaFunctionWithParameter lambdaFunctionWithParameter1 = (msg) -> System.out.println("message is : " + msg);

        LambdaFunctionWithParameter lambdaFunctionWithParameter2 = (String msg) -> System.out.println("message is : " + msg);

        LambdaFunctionWithParameter lambdaFunctionWithParameter3 = (String msg) -> {
            System.out.println("message is : " + msg);
        };

        lambdaFunctionWithParameter3.message("good morning");
    }
}
