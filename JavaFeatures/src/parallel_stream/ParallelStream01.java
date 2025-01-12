package parallel_stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream01 {
    public static void main(String[] args) {
        System.out.println(List.of(1,2,3,4,5,6,7,8,9,10).stream().parallel().count());
        System.out.println(List.of(1,2,3,4,5,6,7,8,9,10).parallelStream().count());

        Arrays.asList("jackal", "kangaroo", "lemur").parallelStream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).forEach(System.out::println);
    }
}
