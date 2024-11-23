package access_specifier;

public class AccessSpecifier01 {
    public static void main(String[] args) {
        AccessSpecifier01 accessSpecifier01 = new AccessSpecifier01();
        accessSpecifier01.sayHello();
        accessSpecifier01.sum(3, 5);

        accessSpecifier01.sayHello02();
        accessSpecifier01.sum2(30, 9);

        accessSpecifier01.sayHello03();
    }

    public void sayHello() {
        System.out.println("hello!");
    }

    //access specifier -> public
    public void sum(int number1, int number2) {
        System.out.println("sum : " + (number1 + number2));
    }

    //access specifier -> default
    void sayHello02() {
        System.out.println("hello2!");
    }

    void sum2(int number1, int number2) {
        System.out.println("sum2 : " + (number1 + number2));
    }

    private void sayHello03() {
        System.out.println("hellooo 03!");
    }

}
