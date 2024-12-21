package list;

import interface_ex.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("ahmet");
        nameList.add("mehmet");
        nameList.add("fatma");
        nameList.add("ayşe");

        List<String> nameList02 = new ArrayList<>();
        nameList02.add("hasan");
        nameList02.add("kadir");
        nameList02.add("aziz");

       /* for(String name : nameList02) {
            nameList.add(name);

        }*/
        nameList.addAll(nameList02);
        nameList.get(2);
        nameList.set(2, "hayriye");
        System.out.println("size : " + nameList02.size());
        System.out.println("size : " + nameList.size());

        System.out.println(nameList.contains("kadir"));
        System.out.println(nameList.contains("abc"));

        Object[] arrayNameList = nameList.toArray();
        String[] stringArray = Arrays.copyOf(arrayNameList, arrayNameList.length, String[].class);

        nameList.remove("abc");
        nameList.remove("kadir");
        nameList.removeAll(nameList);
        nameList.removeLast();
        System.out.println();
    }
}
