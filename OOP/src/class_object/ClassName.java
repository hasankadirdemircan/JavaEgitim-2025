package class_object;

public class ClassName {
     public int number = 11;
    public static int number2 = 11;

     private static String GET_CUSTOMER_PATH = "/getCustomer";
     private static double PI_NUMBER = 3.14;
    public static void main(String[] args) {
        int number = 5;
        System.out.println("number : " + number);
        ClassName className = new ClassName();
        className.sayHi();
        System.out.println(className.number);
        System.out.println(number2);
        System.out.println(PI_NUMBER);
    }

    public void sayHi() {
        System.out.println("number : " + number);
    }

    public static void sayHi2() {
        System.out.println("number2 : " + number2);
    }
}
