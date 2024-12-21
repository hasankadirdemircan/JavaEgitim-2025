package map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class LinkedHashMap02 {

    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap01 = new LinkedHashMap<>();
        linkedHashMap01.put(4, "dort");
        linkedHashMap01.put(1, "bir");
        linkedHashMap01.put(5, "bes");
        linkedHashMap01.put(null, "null");
        linkedHashMap01.put(3, null);


        Map<Integer, String> linkedHashMap02 = new LinkedHashMap<>();
        linkedHashMap02.put(4, "dort");
        linkedHashMap02.put(1, "bir");
        linkedHashMap02.put(5, "bes");
        linkedHashMap02.put(3, "nnull");

        Map<Integer, String> treeMap01 = new TreeMap<>();
        treeMap01.put(4, "dort");
        treeMap01.put(1, "bir");
        treeMap01.put(5, "bes");
       // treeMap01.put(null, "null");
        treeMap01.put(3, null);

        Map<Integer, String> treeMap02 = new TreeMap<>(linkedHashMap02);

        Map<Integer, String> sorted = linkedHashMap02.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new)
                );
        System.out.println(linkedHashMap01);
        // Collectors.s.sort(linkedHashMap01);

        LinkedHashMap<Integer, String> linkedHashMap03 = new LinkedHashMap<>();
        linkedHashMap03.putLast(8, "sekiz");
        linkedHashMap03.put(3, "uc");
        linkedHashMap03.put(2, "iki");
        linkedHashMap03.putFirst(4, "dort");
        System.out.println();
    }
}
