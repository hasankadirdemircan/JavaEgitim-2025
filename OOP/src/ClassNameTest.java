import java.util.Scanner;

public class ClassNameTest {

    public static void main(String[] args) {
        ClassName className = new ClassName();
        className.sayHi();

        System.out.println(className.number);
        ClassName.sayHi2();
        System.out.println(ClassName.number2);
        Scanner scannerInstance = new Scanner(System.in);
    }
}
