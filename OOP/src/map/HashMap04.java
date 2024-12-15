package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap04 {

    public static void main(String[] args) {
        Map<String, Integer> eveNumbersMap = new TreeMap<>();
        eveNumbersMap.put("Two", 2);
        eveNumbersMap.put("Four", 4);
        System.out.println("TreeMap : " + eveNumbersMap);

        Map<String, Integer> oddNumbers =  new HashMap<>(eveNumbersMap);
        oddNumbers.put("Three", 3);

        System.out.println("HashMap : " + oddNumbers);
    }
}
