package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet02 {

    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        System.out.println("LinkedHashSet : " + linkedHashSet);

        System.out.println("foreach");
        for(Integer number : linkedHashSet) {
            System.out.println(number);
        }

        System.out.println("iterator");
        Iterator<Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
