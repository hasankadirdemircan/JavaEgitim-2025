package predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Predicate02 {
    public static void main(String[] args) {
        List<String> myList = List.of("java8", "hasan", "kadir", " demircan", "hello");
        Stream<String> myStream = myList.stream();

        Predicate<String> predicate1 = element -> element.length() == 5;
        myStream.filter(predicate1).forEach(System.out::println);

    //    List<String> length5Names = myList.stream().filter(predicate1).collect(Collectors.toList());
        List<String> length5Names = myList.stream().filter(predicate1).toList();
        System.out.println(length5Names);
    }
}
