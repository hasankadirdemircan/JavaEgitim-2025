package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediate05 {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("hasan", "kadir", "demircan");
        s.map(String::length).forEach(System.out::print);

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        List<Integer> even = numbers.stream()
                .map(Integer::valueOf)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
}
