package inheritance;

public class Dog extends Animal{
    private String surname;

    public Dog(String name, String surname) {
        super(name);
        this.surname = surname;
    }

    public void sayHi() {
        System.out.println("hav hav");
        //eat();
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
        super.eat();
    }
}
