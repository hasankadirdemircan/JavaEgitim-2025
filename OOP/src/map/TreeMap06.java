package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap06 {
    public static void main(String[] args) {
        Map<String, String> numbers3 = new TreeMap<>();
        numbers3.put("bir", "one");
        numbers3.put("iki", "two");
        //numbers.firstEntry()

        TreeMap<String, String> numbers2 = new TreeMap<>();
        numbers2.put("uc", "three");
        numbers2.put("dort", "four");
        numbers2.firstEntry();
        numbers2.lastEntry();

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        // Using the firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + numbers.firstEntry());

        // Using the lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());

    }
}
