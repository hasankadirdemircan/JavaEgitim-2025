package stream;

import java.util.stream.Stream;

public class TerminalOperation01 {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("k1", "k2", "k3");
        long countElement = s1.count();
        System.out.println(countElement);
    }
}
