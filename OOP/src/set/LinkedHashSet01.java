package set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        Set<Integer> evenNumber = new LinkedHashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("LinkedHashSet : " + evenNumber);

        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("new LinkedHashSet : " + numbers);
    }
}
