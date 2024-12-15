package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap03 {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // Using get()
        Integer value1 = numbers.get("Threee");
        System.out.println("Using get(): " + value1);

        Integer value3 = numbers.get("Three");
        System.out.println("Using get(): " + value3);
        // Using getOrDefault()
        Integer value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);

    }
}
