package predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Predicate01 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = element -> element.startsWith("h");
        Predicate<String> predicate2 = (element) -> element.startsWith("h");
        Predicate<String> predicate3 = (String element) -> element.startsWith("h");
        Predicate<String> predicate4 = (String element) -> {
            return element.startsWith("h");
        };

        System.out.println(predicate1.test("hasan"));
        System.out.println(predicate2.test("kadir"));

        Stream.of("java8", "hasan", "kadir", " demircan", "hello").filter(predicate3).forEach(System.out::println);
        List.of("java8", "hasan", "kadir", " demircan", "hello").stream().filter(predicate3).forEach(System.out::println);
    }
}
