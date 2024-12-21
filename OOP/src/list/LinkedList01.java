package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        List<String> nameList = new LinkedList<>();
        nameList.add("ahmet");
        nameList.add("mehmet");
        nameList.add("ayşe");

        for(String name: nameList) {
            System.out.println(name);
        }
        nameList.get(2);

        nameList.remove("mehmet");
    }
}
