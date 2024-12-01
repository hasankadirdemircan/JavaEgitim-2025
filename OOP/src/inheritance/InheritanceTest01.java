package inheritance;

public class InheritanceTest01 {

    public static void main(String[] args) {
        Animal animal = new Animal("a");
        System.out.println("animal");
        animal.getName();
        animal.eat();

        Dog dog = new Dog("vampir", "abc");
        System.out.println("dog");
    //    dog.setName("vampir");
        dog.sayHi();
        System.out.println(dog.getName());
        dog.eat();
    }
}
