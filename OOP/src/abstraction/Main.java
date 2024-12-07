package abstraction;

public class Main {
    public static void main(String[] args) {
        //AbstractClass01 abstractClass01 = new AbstractClass01();
        // you can not use new keyword for abstract classes
        SubClass subClass = new SubClass();
        subClass.sayHi2();

    }
}
