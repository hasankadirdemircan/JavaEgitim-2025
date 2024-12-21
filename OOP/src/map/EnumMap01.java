package map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMap01 {
    public static void main(String[] args) {
        Map<Days, String> enumMap = new EnumMap<>(Days.class);

        enumMap.put(Days.MONDAY, "First day");
        enumMap.put(Days.FRIDAY, "Fifth day");

        System.out.println("Value of Monday : " + enumMap.get(Days.MONDAY));
    }
}
