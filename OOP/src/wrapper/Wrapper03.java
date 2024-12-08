package wrapper;

public class Wrapper03 {

    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf("500");
        int int1 = integer1;
        int int2 = integer1.intValue();
        long long1 = integer1.longValue();
        String string1 = integer1.toString();

        int int3 = Integer.parseInt("100"); // autounboxing
        Integer integer3 = Integer.valueOf("100");
        int int4 = integer3.intValue(); // autounboxing
        Integer integer2 = Integer.valueOf(1);// autoboxing

        int[] numbers = new int[5];
        Integer[] numbers2 = new Integer[5];

        int number = 0;
        Integer integer = null;
        System.out.println();
    }
}
