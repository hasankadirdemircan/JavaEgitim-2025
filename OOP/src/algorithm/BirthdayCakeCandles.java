package algorithm;

import java.util.Arrays;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        int[] candles = {4, 4, 1, 3};
        int candleCount = birthdayCakeCandlesint(candles);
        System.out.println(candleCount);
    }

    public static int birthdayCakeCandlesint(int[] candles) {
        System.out.println(Arrays.toString(candles));
        Arrays.sort(candles);
        System.out.println(Arrays.toString(candles));
        int max = candles[candles.length-1];
        int candleCount = 0;
        for(int candle : candles) {
            if(candle == max) {
                candleCount++;
            }
        }
        return candleCount;
    }
}
