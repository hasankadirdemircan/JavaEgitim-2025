package set;

import java.util.EnumSet;
import java.util.Set;

public class EnumSet01 {

    public static void main(String[] args) {
        // Set<Size> enumSet = new EnumSet<>(Size.class); Abstract class'lar new ile türetilemezler.

        Set<Size> sizeSet1 = EnumSet.allOf(Size.class);
        EnumSet<Size> sizeSet2 = EnumSet.allOf(Size.class);

        System.out.println(sizeSet1);

        Set<Size> sizeSet3 = EnumSet.of(Size.EXTRALARGE, Size.LARGE);
        System.out.println(sizeSet3);

        Set<Size> sizeSet4 = EnumSet.noneOf(Size.class);
        System.out.println(sizeSet4);

        sizeSet4.add(Size.SMALL);
        System.out.println(sizeSet4);

        sizeSet4.addAll(sizeSet1);
        System.out.println(sizeSet4);

    }
}
