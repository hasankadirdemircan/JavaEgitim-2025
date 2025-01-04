package parallel_stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream08 {
    public static void main(String[] args) {
        List.of(1, 5, 20, 4, 3, 8, 100)
                .stream()
                .unordered()
                .parallel()
                .forEach(System.out::println);


        Integer findAny2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallelStream().findAny().get();
        System.out.println(findAny2);
    }
}
