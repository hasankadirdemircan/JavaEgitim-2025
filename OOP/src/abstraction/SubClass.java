package abstraction;

public class SubClass extends AbstractClass01{

    final int number = 5;
    @Override
    void sayHi() {
        System.out.println("sayHi from SubClass");
    }

}
