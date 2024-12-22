package set;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSet02 {

    public static void main(String[] args) {
        Set<Size> sizeSet = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);

        System.out.println(sizeSet);

        for(Size size : sizeSet) {
            System.out.println("size : " + size);
        }

        sizeSet.remove(Size.LARGE);
        Iterator<Size> iterator = sizeSet.iterator();
        System.out.println("EnumSet iterator : ");
        while(iterator.hasNext()) {
            System.out.println("size : " + iterator.next());
        }
    }
}
