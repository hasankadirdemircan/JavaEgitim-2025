package design_patterns.singleton_design_pattern;

public class Main {
    public static void main(String[] args) {
       LazySingletonExample lazySingletonExample = LazySingletonExample.getInstance();
       LazySingletonExample lazySingletonExample1 = LazySingletonExample.getInstance();
       LazySingletonExample lazySingletonExample2 = LazySingletonExample.getInstance();
       LazySingletonExample lazySingletonExample3 = LazySingletonExample.getInstance();
       LazySingletonExample lazySingletonExample4 = LazySingletonExample.getInstance();

        System.out.println("singletonExample ==> " + lazySingletonExample);
        System.out.println("singletonExample1 ==> " + lazySingletonExample1);
        System.out.println("singletonExample2 ==> " + lazySingletonExample2);
        System.out.println("singletonExample3 ==> " + lazySingletonExample3);
        System.out.println("singletonExample4 ==> " + lazySingletonExample4);


        EagerSingletonExample eagerSingletonExample = EagerSingletonExample.getInstance();
        EagerSingletonExample eagerSingletonExample2 = EagerSingletonExample.getInstance();
        EagerSingletonExample eagerSingletonExample3 = EagerSingletonExample.getInstance();
        System.out.println("eagerSingletonExample ==> " + eagerSingletonExample);
        System.out.println("eagerSingletonExample2 ==> " + eagerSingletonExample2);
        System.out.println("eagerSingletonExample3 ==> " + eagerSingletonExample3);


        Thread thread1 = new Thread(() -> {
            ThreadSafeSingletonExample singletonExample = ThreadSafeSingletonExample.getInstance();
            System.out.println("Thread1 Singleton instance created");
        });

        Thread thread2 = new Thread(() -> {
            ThreadSafeSingletonExample singletonExample = ThreadSafeSingletonExample.getInstance();
            System.out.println("Thread2 Singleton instance created");
        });

        thread1.start();
        thread2.start();
    }
}
