package thread;

public class SynchronizedExample {
    private int count = 0;
    public synchronized void increment() {
        count++;
    }
//synchronized -> to avoid race contidion.
    public static void main(String[] args) {
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        Thread thread1 = new Thread(() -> {
            for(int i=0; i<10000; i++) {
                synchronizedExample.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i=0; i<10000; i++) {
                synchronizedExample.increment();
            }
        });
        thread1.start();
        thread2.start();;

       try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("sonuc : " + synchronizedExample.count);
    }
}
