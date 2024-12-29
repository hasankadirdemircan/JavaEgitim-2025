package interface_features.diamond2;

public interface BaseInterface {
    public default void message() {
        System.out.println("BaseInterface message..");
    }
}
