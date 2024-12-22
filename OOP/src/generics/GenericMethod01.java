package generics;

public class GenericMethod01 {

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4};
        String[] strings = {"a", "b", "c", "d"};

        System.out.println("integers");
        System.out.println(plusArray(integers));

        System.out.println("doubles");
        System.out.println(plusArray(doubles));

        System.out.println("strings");
        System.out.println(plusArray(strings));
    }

    public static <T> T plusArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");
        }
        return array[0];
    }
}
