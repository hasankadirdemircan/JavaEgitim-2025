package consumer;

import java.util.List;
import java.util.function.Consumer;

public class Consumer02 {
    public static void main(String[] args) {
        Consumer<Integer> consumer1 = x -> System.out.println(x*2);

        consumer1.accept(15);

        List<Integer> numberList = List.of(3,4,5,6);
        numberList.stream().forEach(consumer1);
       // numberList.stream().filter(consumer1);
    }
}
