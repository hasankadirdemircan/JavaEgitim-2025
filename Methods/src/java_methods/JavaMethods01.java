package java_methods;

import java.util.Arrays;
import java.util.Random;

public class JavaMethods01 {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(Math.sqrt(number));

        System.out.println(Math.pow(number, 3));

        int number2 = -10;
        System.out.println(Math.abs(number2));

        int[] arr = {1,2,3,4,9};
        System.out.println(arr.length);
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {3,1,5,6,9,7,6,8};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        Random random = new Random();
        int randomNumber = random.nextInt(6)+1;
    }
}
