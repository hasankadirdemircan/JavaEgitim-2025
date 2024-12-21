package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet03 {
    public static void main(String[] args) {
        Set<Integer> treeSet01 = new TreeSet<>();
        //treeSet01.sub
        TreeSet<Integer> treeSet02 = new TreeSet<>();
        treeSet02.add(3);
        treeSet02.add(2);
        treeSet02.add(1);
        treeSet02.add(4);
        treeSet02.add(5);
        treeSet02.add(15);
        treeSet02.add(0);
        System.out.println("treeSet : " + treeSet02);

        System.out.println("Using subSet without boolean value : " + treeSet02.subSet(2, true, 4, true));

        System.out.println("Using subSet with boolean value : " +
                treeSet02.subSet(2, false, 5, true));
    }
}
