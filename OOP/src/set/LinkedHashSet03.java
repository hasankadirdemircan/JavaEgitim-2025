package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet03 {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(5);
        numbers.add(14);
        System.out.println("LinkedHashSet : " + numbers);

        boolean value1 = numbers.remove(2);
        System.out.println("is 2 removed? : " + value1);

        boolean value2 = numbers.remove(11);
        System.out.println("is 11 removed? : " + value2);

        System.out.println("LinkedHashSet now : " + numbers);

       //numbers.clear();
        boolean value3 = numbers.removeAll(numbers);
        System.out.println("are all elements removed? : " + value3);
        System.out.println("LinkedHashSet now : " + numbers);
    }
}
