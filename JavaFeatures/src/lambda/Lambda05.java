package lambda;

@FunctionalInterface
interface LambdaFunctionV2 {
    String intKind(int number);
}

public class Lambda05 {

    public static void main(String[] args) {
        LambdaFunctionV2 lambdaFunction = (int number) -> {
            if(number % 2 == 0) {
                return "even";
            }else {
                return "odd";
            }
        };

        LambdaFunctionV2 lambdaFunction1 = number -> {
            if(number % 2 == 0) return "even";
            else return "odd";
        };


        System.out.println("kind of 5 : " + lambdaFunction.intKind(5));
        System.out.println("kind of 8 : " + lambdaFunction1.intKind(8));
    }
}
