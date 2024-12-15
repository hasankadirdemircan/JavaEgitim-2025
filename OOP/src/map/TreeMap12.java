package map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap12 {
    public static void main(String[] args) {

        // Creating a treemap with a customized comparator
        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());

        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);


        // Creating a treemap with a customized comparator
        TreeMap<String, Integer> numbers2 = new TreeMap<>();

        numbers2.put("First", 1);
        numbers2.put("Second", 2);
        numbers2.put("Third", 3);
        numbers2.put("Fourth", 4);
        System.out.println("TreeMap2: " + numbers2);
    }

    // Creating a comparator class
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String number1, String number2) {
            int value =  number1.compareTo(number2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }

}
