package algorithm;

import java.util.Arrays;
import java.util.List;

//Mini-Max Sum - HackerRank
public class Algorithm01 {

    public static void main(String[] args) {
        int[] array = {9,3,5,7,1};
        miniMaxSum(array);
    }

    public static void miniMaxSum(int[] arr) {

        Arrays.sort(arr); // veya sıralama algoritmaları ile kendin çözebilirsin -> Bubble sort
        int[] minArray = Arrays.copyOfRange(arr, 0, 4);
        int[] maxArray = Arrays.copyOfRange(arr, 1, 5);

        int min = 0;
        for(int number: minArray) {
            min = min + number;
        }

        int max = 0;
        for(int number: maxArray) {
            max = max + number;
        }
        System.out.println(min + " " + max);
    }
}
