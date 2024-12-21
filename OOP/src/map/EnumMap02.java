package map;

import java.util.EnumMap;

public class EnumMap02 {
    public static void main(String[] args) {
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
        sizes.put(Size.EXTRALARGE, 40);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.SMALL, 28);

        System.out.println("EnumMap : " + sizes);

        int removedValue = sizes.remove(Size.LARGE);
        System.out.println("removed this value : " + removedValue);
        System.out.println("Enum Map : " + sizes);
    }
}
