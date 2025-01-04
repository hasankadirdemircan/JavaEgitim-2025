package stream;

import java.util.Arrays;
import java.util.List;

public class StreamIntermediate07 {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        System.out.println(nestedList);

        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flattenedList);
    }
}
