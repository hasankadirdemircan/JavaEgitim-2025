package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(4);
        numberList.add(1);
        numberList.add(10);
        numberList.add(20);
        numberList.add(2);
        numberList.add(8);
        numberList.add(34);

        System.out.println("reverse order");
        Collections.sort(numberList, Collections.reverseOrder());
        System.out.println(numberList);

        System.out.println("order");
        Collections.sort(numberList);
        System.out.println(numberList);

        System.out.println("index of 4 : " + numberList.indexOf(4));
        System.out.println(numberList.isEmpty());

        numberList.removeLast();
        System.out.println("after removelast : " + numberList);
        List<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());
    }
}
