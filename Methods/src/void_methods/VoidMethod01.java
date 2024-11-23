package void_methods;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VoidMethod01 {


    public static void main(String[] args) {

        System.out.println("Hello from main method");
       /*Scanner scanner = new Scanner(System.in);
        scanner.nextInt();*/
        VoidMethod01 voidMethod01 = new VoidMethod01();
        voidMethod01.sayHello();

        voidMethod01.sayHelloWithUsername("ahmet");
        voidMethod01.sayHelloWithUsername("ayşe");
        voidMethod01.sayHelloWithUsername("fatma");

        voidMethod01.sayHelloWithUsernameAndLastName("kadir", "demircan");
        System.out.println("program kapanıyor.");
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    void sayHelloWithUsername(String username) {
        System.out.println("Hello " + username);
    }

    void sayHelloWithUsernameAndLastName(String username, String lastName) {
        System.out.println("Hello " + username + " " + lastName);
    }

}

