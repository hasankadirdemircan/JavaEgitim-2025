package thread;

public class Main02 {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello");
        Thread02 thread02 = new Thread02();
        Thread thread = new Thread(thread02);
        System.out.println("hello");
        System.out.println("hello");
        thread.start();
        System.out.println("hello");
        System.out.println("hello");
    }

}
