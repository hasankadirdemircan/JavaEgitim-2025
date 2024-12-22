package generics;

public class GenericWithVarArg {
    public static void main(String[] args) {
        printArray("Merhaba", "Dunya");
        printArray("Merhaba", "Dunya", "Gunaydin");
        printArray(1, 2, 3, 4, 5, 6);
        printArray("Hel", 1);
        printArray(2.0, 3.0, 4.0, 6.0);
    }

    public static <T> void printArray(T... data) {
        System.out.println("printArray method");
        for(T item : data) {
            System.out.println(item);
        }
    }

    // T... data        String... names
    public static void printArray2(String a, String b) {

    }
}
