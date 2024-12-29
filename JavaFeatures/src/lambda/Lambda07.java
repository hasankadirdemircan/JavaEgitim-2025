package lambda;

@FunctionalInterface
interface FuncInterface{
    void eat();
}

class Cat{

}
public class Lambda07 {
    public static void main(String[] args) {
        FuncInterface funcInterface = () -> new Cat();
    }
}
