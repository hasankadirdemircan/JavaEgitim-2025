package design_patterns.singleton_design_pattern;

public class EagerSingletonExample {
    private static EagerSingletonExample eagerSingletonExample = new EagerSingletonExample();

    private EagerSingletonExample() {
    }

    public static EagerSingletonExample getInstance() {
        return eagerSingletonExample;
    }
}
