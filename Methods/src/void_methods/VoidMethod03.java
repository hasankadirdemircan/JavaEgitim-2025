package void_methods;

public class VoidMethod03 {

    /*
    Main method içerisinde bir int Array tanımlayınız.
    daha sonra bu array'i sum adında void bir methoda gönderiniz.

    sum methodu, array içerisindeki int değerleri toplayıp toplamını ve ortalamasını ekrana yazsın.
     */

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        VoidMethod03 voidMethod03 = new VoidMethod03();
        voidMethod03.sum(numbers);
        voidMethod03.average(numbers);
    }

    void sum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum = sum + number;
        }
        System.out.println("sum: " + sum);
    }

    void average(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum = sum + number;
        }
        System.out.println("average : " + (double)sum/numbers.length);
    }
/*
    void average2(int sum, int arrayLength) {
        System.out.println("average : " + (double)sum/arrayLength);
    }*/
}
