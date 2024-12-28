package design_patterns.singleton_design_pattern;

public class ThreadSafeSingletonExample {
    private static ThreadSafeSingletonExample threadSafeSingletonExample;

    private ThreadSafeSingletonExample() {
    }

    //synchronized -> Thread Safe
    public static synchronized ThreadSafeSingletonExample getInstance() {
        System.out.println("ThreadSafeSingletonExample");
        if(threadSafeSingletonExample == null) {
            threadSafeSingletonExample = new ThreadSafeSingletonExample();
            return threadSafeSingletonExample;
        }
        return threadSafeSingletonExample;
    }
}
