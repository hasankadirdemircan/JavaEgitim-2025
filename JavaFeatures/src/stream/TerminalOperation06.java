package stream;

import java.util.stream.Stream;

public class TerminalOperation06 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w1", "o2", "l3", "f4");
        String word = stream.reduce("X", String::concat);
        System.out.println(word);


        System.out.println("stream2");
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream2.reduce("", (s, c) -> s + c +"--");
        System.out.println(word2);
    }
}
