package void_methods;

public class VoidMethod02 {

    public static void main(String[] args) {
        VoidMethod02 voidMethod02 = new VoidMethod02();
        voidMethod02.sum(3, 5);
        voidMethod02.minus(10, 20, -5);


        int age = 30;
        String username = "ahmet";
        double salary = 5705.4;
        String[] childrenNames = {"Ayşe", "Fatma", "Ahmet"};
        voidMethod02.sayHello(age, username, salary, childrenNames);
    }

    void sum(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("sum : " + sum);
        System.out.println("sum : " + (number1 + number2));
    }

    void minus(int number1, int number2, int number3) {
        int result = number1 - number2 - number3;
        System.out.println("result : " + result);
    }

    void sayHello(int age, String username, double salary, String[] childrenNames) {
        System.out.println("Hello " + username + " your age is : " + age + " , and your salary : " + salary);
        System.out.println("your children names are : ");
        for(String childrenName : childrenNames) {
            System.out.println(childrenName);
        }
    }
}
