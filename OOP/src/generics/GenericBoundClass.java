package generics;

public class GenericBoundClass<T extends Number> {

    public void display() {
        System.out.println("This is a bounded type generics class");
    }


    public static <T> T plusArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");
        }
        return array[0];
    }
}
