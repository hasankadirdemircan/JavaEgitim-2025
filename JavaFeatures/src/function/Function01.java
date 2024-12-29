package function;

import java.util.List;
import java.util.function.Function;

public class Function01 {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = e -> e.length();

        int result1 = lengthFunction.apply("merhaba");
        int result2 = lengthFunction.apply("java");
        int result3 = lengthFunction.apply("hello");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
