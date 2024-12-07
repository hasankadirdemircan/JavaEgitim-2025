package polymorphism.override;

public class Dog extends Animal {

    int size = 4;
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
