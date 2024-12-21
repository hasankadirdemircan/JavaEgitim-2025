package set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashSet02 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(5);
        set2.add(15);

        set2.retainAll(set1);
        System.out.println("retainAll method () : " + set1);
        System.out.println(set2);

        System.out.println(set1.contains(4));
        System.out.println(set1.contains(5));
  //      set1.remove(1);

        for(int number : set1) {
            System.out.println(number);
        }

        System.out.println("iterator..");
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
