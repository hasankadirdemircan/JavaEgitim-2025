package design_patterns.singleton_design_pattern;

public class LazySingletonExample {

    private static LazySingletonExample lazySingletonExample;

    private LazySingletonExample() {

    }

    public static LazySingletonExample getInstance() {

        if(lazySingletonExample == null) {
            lazySingletonExample = new LazySingletonExample();
            return lazySingletonExample;
        }
        return lazySingletonExample;
    }
}
