package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap01 {

    public static void main(String[] args) {
        Map<Integer, String> cityMap = new TreeMap<>();
        cityMap.put(6, "ankara");
        cityMap.put(34, "istanbul");

     //   cityMap.put(null, "not found"); "main" java.lang.NullPointerException
        cityMap.put(82, null);

        cityMap.putIfAbsent(82, "x");
        cityMap.putIfAbsent(34, "xx");
        cityMap.put(83, "y");
        System.out.println(cityMap);

        Map<Integer, String> cityMap2 = new TreeMap<>();
        cityMap.put(35, "izmir");

        cityMap.putAll(cityMap2);
        System.out.println("cityMap : " + cityMap);



    }
}
