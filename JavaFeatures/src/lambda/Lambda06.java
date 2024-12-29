package lambda;

@FunctionalInterface
interface LambdaFinal{
    void printMessage(String msg);
}
public class Lambda06 {

    public static void main(String[] args) {
        String value1 = "hello";
        String value2 = "java";
        final String value3 = "world!";

        LambdaFinal lambdaFinal = message -> {
         /*   value1 = value1 + " hey";
            value1 = " hey";
            value2 = " abc";
            value3 = " xyz";*/
            System.out.println(message + "." + value1 + " " + value2 +  " " + value3);
        };
    }
}
