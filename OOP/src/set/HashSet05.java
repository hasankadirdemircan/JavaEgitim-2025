package set;

import java.util.HashSet;
import java.util.Set;

public class HashSet05 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("set1 : " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(5);

        Set<Integer> set3 = new HashSet<>();
        set3.add(2);
        set3.add(3);
        set3.add(1);

        Set<Integer> set4 = new HashSet<>();
        set4.add(4);
        set4.add(5);
        set4.add(6);

        Set<Integer> set5 = new HashSet<>();
        set5.add(1);

        System.out.println(set1.containsAll(set2));
        System.out.println(set1.containsAll(set3));
        System.out.println(set1.containsAll(set4));

        System.out.println(set1.containsAll(set5));
        System.out.println(set3.containsAll(set5));

        set5.hashCode();
    }
}
