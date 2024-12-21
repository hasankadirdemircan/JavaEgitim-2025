package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(1);
        numberList.add(1);
        numberList.add(2);
        numberList.add(2);
        numberList.add(3);
        System.out.println("arraylist : " + numberList);

        Set<Integer> numberSetList = new HashSet<>();
        numberSetList.add(1);
        numberSetList.add(1);
        numberSetList.add(1);
        numberSetList.add(2);
        numberSetList.add(2);
        numberSetList.add(3);

        Set<Integer> numberSetList2 = new HashSet<>();
        numberSetList2.add(1);
        numberSetList2.add(5);
        System.out.println("HashSet : " + numberSetList);
        System.out.println("HashSet : " + numberSetList2);

        numberSetList.addAll(numberSetList2);
        System.out.println("HashSet after addAll() : " + numberSetList);

        numberSetList.remove(1);
        System.out.println("after remove() : " + numberSetList);
        numberSetList.clear();
        System.out.println("after clear() : " + numberSetList);
    }
}
