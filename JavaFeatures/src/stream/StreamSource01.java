package stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamSource01 {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5).filter(e -> e % 2 == 0).forEach(System.out::println);
        List.of(1,2,3,4,5).stream().filter(e -> e % 2 == 0).toList();

        Stream<Double> random = Stream.generate(Math::random).limit(5);
        List<Double> randomList = Stream.generate(Math::random).limit(5).toList();
        List<Integer> oddNumbers = Stream.iterate(1, n-> n + 2).limit(5).toList();

        System.out.println(oddNumbers);
    }
}
