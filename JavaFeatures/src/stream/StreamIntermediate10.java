package stream;

import java.util.stream.Stream;

public class StreamIntermediate10 {
    public static void main(String[] args) {
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .sorted() // wrong usage OutOfMemory error
                .limit(2)
                .forEach(System.out::println);


        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
    }
}
