package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {
        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "bir");
        hashMap1.put(2, "iki");
        hashMap1.put(3, "uc");

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(4, "dort");
        hashMap2.put(5, "bes");

        hashMap2.putAll(hashMap1);

        System.out.println("key 3 : " + hashMap2.get(3));
        System.out.println("default : " + hashMap2.getOrDefault(0, "sifir"));

        hashMap2.put(6, null);
        hashMap2.put(null, null);
        hashMap2.put(null, null);
        hashMap2.put(null, null);
        System.out.println(hashMap2.containsKey(4));
        System.out.println(hashMap2.containsKey(null));
        System.out.println(hashMap2.containsKey(9));
        System.out.println(hashMap2.containsValue(null));
        System.out.println(hashMap2.containsValue("bes"));
        System.out.println(hashMap2.containsValue("asddd"));

        hashMap2.put(15, "bes");
        hashMap2.put(17, "bes");
        hashMap2.put(5, "xbes");
        hashMap2.replace(5, "newbes");
        hashMap2.replace(5, "newbes", "bess");
        hashMap2.replace(5, "newbes2", "bess1");

        System.out.println("hashMap2.remove(1) : " + hashMap2.remove(1));
        System.out.println("hashMap2.remove(2) : " + hashMap2.remove(2, "ikii"));
        System.out.println("hashMap2.values() : " + hashMap2.values());
        System.out.println("hashMap2.keys() : " + hashMap2.keySet());

        System.out.println("hashMap2 : " + hashMap2);
        System.out.println();
        System.out.println("for loop");
        for(Integer key : hashMap2.keySet()) {
            System.out.println("key : " + key + " value : " + hashMap2.get(key));
        }
    }
}
