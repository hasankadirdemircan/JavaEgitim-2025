package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        Set<Integer> treeSet01 = new TreeSet<>();
        treeSet01.add(3);
        treeSet01.add(1);
        treeSet01.add(11);

        System.out.println("treeSet : " + treeSet01);

        treeSet01.add(8);
        System.out.println("treeSet after add() : " + treeSet01);

        Set<Integer> treeSet02 = new TreeSet<>();
        treeSet02.add(4);
        treeSet02.add(16);
        System.out.println("treeset02 : " + treeSet02);

        treeSet01.addAll(treeSet02);
        System.out.println("treeSet01 after addAll() : " + treeSet01);
    }
}
