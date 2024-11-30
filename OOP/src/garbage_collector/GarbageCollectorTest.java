package garbage_collector;

import java.util.Date;

public class GarbageCollectorTest {
    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory : " + runtime.totalMemory());

        System.out.println("Free Memory : " + runtime.freeMemory());

        Date date = null;

        for(int i=0; i<=10000000; i++) {
            date = new Date();
            date = null;
        }

        System.out.println("After Free Memory : " + runtime.freeMemory());
        System.gc();
        System.out.println("After GC Free Memory : " + runtime.freeMemory());
    }
}
