package algorithm;

import java.util.ArrayList;
import java.util.List;

public class SalesByMatch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = arr.length;
        int matchCount = sockMerchant(n, arr);
        System.out.println();
        System.out.println("Match count is : " + matchCount);
    }

    public static int sockMerchant(int n, int[] ar) {
        int count = 0;
        int[] declinedNumbers = new int[n];
        for(int i=0; i<n; i++) {
            int match = 0;
            boolean shouldCheck = shouldCheck(ar[i], declinedNumbers);
            if(shouldCheck) {
                for(int j=i; j<n; j++) {
                    if(ar[i]  == ar[j]) {
                        match++;
                    }
                }
                declinedNumbers[i] = ar[i];
            }
            count = count + (match / 2);
        }
        return count;
    }

    public static boolean shouldCheck(int number, int[] declinedNumbers) {
        for(int decline : declinedNumbers) {
            if(number == decline) {
                return false;
            }
        }
        return true;
    }

}
