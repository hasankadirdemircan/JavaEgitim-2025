package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate04 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("java8");
        stringList.add("hasan");
        stringList.add("kadir");
        stringList.add("demircan");
        stringList.add("hello");

        Predicate<String> removePredicate = str -> str.startsWith("h");
        stringList.removeIf(removePredicate);
        stringList.removeIf(str -> str.startsWith("h")); //önerilen ve kullanılan
        stringList.forEach(System.out::println);
    }
}
