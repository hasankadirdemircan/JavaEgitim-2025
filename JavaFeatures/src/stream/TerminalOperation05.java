package stream;

import java.util.stream.Stream;

public class TerminalOperation05 {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print);
    }
}
