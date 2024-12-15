package map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class HashMap03 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "bir");
        hashMap.put(2, "iki");

        hashMap.putIfAbsent(2, "ikiii");
        System.out.println(hashMap);

        hashMap.replaceAll((key, value) -> value.toUpperCase(new java.util.Locale("tr", "TR")));
        System.out.println(hashMap.entrySet());

        // iterate through key/value entries
        System.out.print("\nEntries: ");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry);
            System.out.println("entry value : " + entry.getValue());
            System.out.println("entry key : " + entry.getKey());
        }
    }
}
