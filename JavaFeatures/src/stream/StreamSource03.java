package stream;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamSource03 {

    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(1, 100).boxed().toList();
        List<Integer> numbers2 = IntStream.rangeClosed(1, 100).boxed().toList();

        System.out.println(numbers);
        System.out.println(numbers2);
    }
}
