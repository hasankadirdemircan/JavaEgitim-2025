package interface_features;

public class Dog implements Animal{
    @Override
    public void sleep() {
        System.out.println("dog is sleeping");
    }

    @Override
    public void run() {
        System.out.println("dog is running");
    }
}
