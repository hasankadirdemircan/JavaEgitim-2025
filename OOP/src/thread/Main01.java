package thread;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");
        Thread01 thread01 = new Thread01();
        System.out.println("hello");
        System.out.println("hello");
        thread01.start(); // thread'i başlat yani run() methodunu çağır
        System.out.println("hello");
        System.out.println("hello");
    }
}
