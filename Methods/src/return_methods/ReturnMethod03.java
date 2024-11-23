package return_methods;

import void_methods.VoidMethod03;

public class ReturnMethod03 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ReturnMethod03 returnMethod03 = new ReturnMethod03();
        int sum = returnMethod03.sum(numbers);
        returnMethod03.average(sum, numbers.length);
    }

    int sum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum = sum + number;
        }
        System.out.println("sum: " + sum);

        return sum;
    }

    void average(int sum, int length) {
        System.out.println("average : " + (double)sum/length);
    }
}
