package algorithm;

import java.util.Arrays;

public class TheHurdleRace {

    public static void main(String[] args) {
        int[] heights = {2, 5, 4, 5, 2};
        int k = 1;
        int neededDoseValue = hurdleRace(k, heights);
        System.out.println("Needs dose value : " + neededDoseValue);
    }


    public static int hurdleRace(int k, int[] heights) {
        Arrays.sort(heights);
        int maxHurdleHeight = heights[heights.length-1];
        int neededDoseValue = maxHurdleHeight - k;

        return neededDoseValue <= 0 ? 0 : neededDoseValue;
    }
/*
    public static int hurdleRace(int k, int[] heights) {
        int max = 0;
        for(int height : heights) {
            int ifNeededDoseValue = height - k;
            if(ifNeededDoseValue > 0 && ifNeededDoseValue > max) {
                max = ifNeededDoseValue;
            }
        }
        return max;
    }*/
}
