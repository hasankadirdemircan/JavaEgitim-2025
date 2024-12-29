package interface_features.diamond;

public interface MyInterface1 {
    public default void defaultMethod() {
        System.out.println("MyInterface1 defaultMethod");
    }

    public abstract void test();
}
