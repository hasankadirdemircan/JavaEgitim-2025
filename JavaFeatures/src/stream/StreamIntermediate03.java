package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediate03 {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10)  // source
                .filter(e -> e % 2 == 0)  //intermediate
                .map(e -> e * 3) //intermediate
                .forEach(System.out::println); // terminal


        Stream.of("Hasan", "Kadir", "", "Java")
                .filter(name -> !name.isEmpty())
                .forEach(System.out::println);
    }
}
