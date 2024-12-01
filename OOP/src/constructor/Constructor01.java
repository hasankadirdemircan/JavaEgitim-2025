package constructor;

public class Constructor01 {

    Constructor01() {
        System.out.println("no-arg constructor");
    }

    public static void main(String[] args) {
        Constructor01 constructor01 = new Constructor01();

        constructor01.sayHi();
    }


    public void sayHi() {
        System.out.println("hello");
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }
}
