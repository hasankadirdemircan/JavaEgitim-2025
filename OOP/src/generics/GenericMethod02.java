package generics;

public class GenericMethod02 {

    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.genericMethod(5);
        demoClass.genericMethod("Java Programming");

        demoClass.<Integer>genericMethod(5);
        demoClass.<String>genericMethod("Java Programming");
    }
}
