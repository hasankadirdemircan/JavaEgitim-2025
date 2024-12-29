package function;

import java.util.function.Function;

public class Function02 {
    public static void main(String[] args) {
        Function<String, Integer> function1 = str -> Integer.parseInt(str);
        Function<String, Integer> function2 = Integer::parseInt;

        System.out.println(function1.apply("25"));
        System.out.println(function2.apply("30"));

        Integer number = function2.apply("39");
        System.out.println("number : " + number);

        Function<Integer, Integer> function3 = e -> Math.abs(e);
        Function<Integer, Integer> function4 = Math::abs;

        System.out.println(function3.apply(-600));
        Integer abs = function4.apply(-900);
        System.out.println("abs : " + abs);

    }
}
