package functional_interface;

import java.util.List;

public class NumberListProcessorMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        //Arrays.asList(1, 2, 3, 5)
        NumberListProcessor sumCalculator = numList -> {
            int sum = 0;
            for(int num: numList) {
                sum += num;
            }
            return sum;
        };

        int totalSum = sumCalculator.process(numbers);
        System.out.println("total sum : " + totalSum);
    }
}