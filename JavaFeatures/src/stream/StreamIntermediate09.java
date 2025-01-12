package stream;

import java.util.List;

public class StreamIntermediate09 {
    public static void main(String[] args) {
        List<String> animals = List.of("brown-", "bear-", "bee-");
        animals.stream().sorted().forEach(System.out::println);
    }
}
