package set;

import java.util.HashSet;
import java.util.Set;

public class HashSet04 {
    public static void main(String[] args) {
        Set<Integer> set1  = new HashSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(5);
        System.out.println("set1 : " + set1);
      //  set1.clear();
    //    System.out.println("set1 after clear() : " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("set2 : " + set2);

        set2.removeAll(set1); //set2 de olup, set1de olmayanları, set2 içerisinde bırakır. aynılarını siler.
        System.out.println("differences : " + set2);

    }
}
