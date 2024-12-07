package polymorphism.override;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        System.out.println("dogAnimal...");
        Animal dogAnimal = new Dog();
        //Dog dog2 = new Animal(); sol tarafa subClass , sağ tarafa superClass yazamazsın
        dogAnimal.sound();
        System.out.println("size : " + dogAnimal.size);

        System.out.println("dog...");
        Dog dog = new Dog();
        dog.sound();
        System.out.println("size : " + dog.size);
    }
}
