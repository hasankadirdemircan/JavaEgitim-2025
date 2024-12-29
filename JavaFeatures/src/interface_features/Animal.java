package interface_features;

public interface Animal {
    public default void eat() {
        System.out.println("eating");
    }

    public default void run() {
        System.out.println("running");
    }

    public static void breathe(){
        System.out.println("breathing");
    }

    public void sleep();
}
