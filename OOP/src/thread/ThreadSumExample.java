package thread;

import java.util.Arrays;
import java.util.Random;

public class ThreadSumExample {

    public static void main(String[] args) {
        int[] numbers = generateNumbersArray(100);
        int total = 0;
        for(int number : numbers) {
            total += number;
        }
        int[] firstHalf = Arrays.copyOfRange(numbers, 0, numbers.length/2);
        int[] secondHalf = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length);

        SumThread firstThread = new SumThread(firstHalf);
        SumThread secondThread = new SumThread(secondHalf);

        firstThread.start();
        secondThread.start();

        try{
            firstThread.join();
            secondThread.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = firstThread.getSum() + secondThread.getSum();
        System.out.println("toplam sonuc : " + totalSum);
        System.out.println("double check sonuc : " + total);

    }

    public static int[] generateNumbersArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for(int i=0; i<size; i++) {
            numbers[i] = random.nextInt(100);
        }

        return numbers;
    }
}
