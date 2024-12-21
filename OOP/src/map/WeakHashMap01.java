package map;

import java.util.HashMap;
import java.util.Map;

public class WeakHashMap01 {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        numbers.put(two, twoValue);
        numbers.put(four, fourValue);

        two = null;

        System.gc();
        System.out.println("HashMap after garbage collection : " + numbers);
    }
}
