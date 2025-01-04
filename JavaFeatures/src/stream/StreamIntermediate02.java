package stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediate02 {

    public static void main(String[] args) {
        List<Integer> count = List.of(1, 2, 3, 4, 5)
                .stream()
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i)).toList();

        System.out.println("stream");
        Long count2 = Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i)).count();
    }
}
