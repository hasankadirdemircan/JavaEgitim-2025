package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet05 {

    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("a");
        stringSet.add("b");
        stringSet.add("c");
        stringSet.add("d");
        stringSet.add("e");
        System.out.println("treeSet : "  + stringSet);

        stringSet.removeAll(stringSet);
        System.out.println("after removeAll() : " + stringSet);


        Set<Integer> evenNumbers = new TreeSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(5);
        System.out.println("TreeSet1: " + evenNumbers);

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("TreeSet2: " + numbers);

        // Difference between two sets
        numbers.removeAll(evenNumbers);
        System.out.println("Difference is: " + numbers);
    }
}
