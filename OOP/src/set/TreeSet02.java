package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet02 {
    public static void main(String[] args) {
        Set<Integer> treeSet01 = new TreeSet<>();



        TreeSet<Integer> treeSet02 = new TreeSet<>();
        treeSet02.add(3);
        treeSet02.add(16);
        System.out.println("first : " + treeSet02.first());
        System.out.println("poll : " + treeSet02.pollFirst());
        System.out.println("treeSet02 : " + treeSet02);
    }
}
