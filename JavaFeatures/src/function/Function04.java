package function;

import java.util.function.Function;

public class Function04 {
    public static void main(String[] args) {
        //Function<String, Integer> function1 = e -> Utility.calculateLengthOfTemp(e);
        Function<String, Integer> function1 =Utility::calculateLengthOfTemp;
        System.out.println(function1.apply("kadir"));

     //   Function<String, Integer> function2 = e -> e.length();
        Function<String, Integer> function2 = String::length;
        System.out.println(function2.apply("hello2"));
    }
}
