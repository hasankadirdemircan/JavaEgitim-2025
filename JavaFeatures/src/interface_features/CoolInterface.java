package interface_features;

public interface CoolInterface {
    public static void staticMethod() {
        System.out.println("static method");
        privateStaticTestMethod();
    }

    private static void privateStaticTestMethod() {
        System.out.println("private static method");
    }
}
