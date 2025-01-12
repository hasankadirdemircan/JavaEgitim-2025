package parallel_stream;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream07 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map = stream1.collect(Collectors.groupingByConcurrent(String::length));
        System.out.println(map);
    }
}
