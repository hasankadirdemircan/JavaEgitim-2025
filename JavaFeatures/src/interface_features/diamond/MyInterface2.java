package interface_features.diamond;

public interface MyInterface2 {
    public default void defaultMethod() {
        System.out.println("MyInterface2 defaultMethod");
    }

    public abstract void test();
}
