package static_methods;

public class StaticMethod01 {

    public static void main(String[] args) {
        StaticMethod01 staticMethod01 = new StaticMethod01();
        int sum = staticMethod01.sum(3,54);
        System.out.println("sum : " + sum);

       int sum2 = sum2(3, 5);
       System.out.println("sum2 : " + sum2);

       int sum3 = StaticMethod01.sum2(15, 25);
       System.out.println("sum3 : " + sum3);
    }

    int sum(int number1, int number2) {
        return number1 + number2;
    }

    static int sum2(int number1, int number2) {
        return number1 + number2;
    }
}
