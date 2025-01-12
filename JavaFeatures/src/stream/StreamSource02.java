package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSource02 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 10);
        intStream.forEach(System.out::print);

        System.out.println();
        IntStream intStream2 = IntStream.rangeClosed(1, 10);
        intStream2.forEach(System.out::print);
    }
}
