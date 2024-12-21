package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap01 {

    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap01 = new LinkedHashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap02 = new LinkedHashMap<>();

        //linkedHashMap02.putFirst() bu method Map'de yok. LinkedHashMap'de var.
      //  linkedHashMap01.putFirst();
        linkedHashMap01.put(null, "null value");
        System.out.println(linkedHashMap01);
    }
}
