public class UnCaughtException {

    public static void main(String[] args) {
        method1(null);
    }

    public static void method1(String name) {
        System.out.println("method1");
        try {
            method2(name);
        }catch (NullPointerException e) {
            System.out.println("NullPointerException catch");
        }

        System.out.println("method1 worked!");
    }

    public static void method2(String name) {
        System.out.println("method2");
        method3(name);
        System.out.println("method2 worked!");
    }

    public static void method3(String name) {
        name.toLowerCase();
        System.out.println("method3 worked!");
    }
}
