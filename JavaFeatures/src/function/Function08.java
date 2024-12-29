package function;

import java.util.function.Function;

public class Function08 {
    public static void main(String[] args) {
        Function<String, Integer> calculateLength = String::length;
    //    Function<Integer, Double> square = number -> number * number;
        Function<Integer, Double> square2 = number -> Math.pow(number, 2);

        Function<String, Double> combine = calculateLength.andThen(square2);

        String text = "Java P";
        double result = combine.apply(text);
        System.out.println("result : " + result);
    }
}
