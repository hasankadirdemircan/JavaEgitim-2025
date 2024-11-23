package return_methods;

public class ReturnMethod01 {

    public static void main(String[] args) {
        ReturnMethod01 returnMethod01 = new ReturnMethod01();
        int sum = returnMethod01.sum(3, 5); // int sum = 8;

        int sum2 = returnMethod01.sum(10, 15);
    }

     int sum(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("sum : " + sum);
        return sum;
    }
}
