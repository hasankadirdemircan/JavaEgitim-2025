package stream;

import java.util.stream.Stream;

public class StreamIntermediate04 {
    public static void main(String[] args) {
        Stream.of("Java", "Java", "JaVa", "Java8", "JavA")
                .distinct()
                .forEach(System.out::println);

        System.out.println("map and distinct");
        Stream.of("Java", "Java", "JaVa", "Java8", "JavA")
                .map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);

    }
}
