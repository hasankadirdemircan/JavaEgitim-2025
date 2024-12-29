package consumer;

import java.util.List;

public class Consumer03 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(3,5,6,7,8,2,4,78);

        integerList.stream().forEach(e -> System.out.println(e/2));
    }
}
