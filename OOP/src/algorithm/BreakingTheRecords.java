package algorithm;

public class BreakingTheRecords {

    public static void main(String[] args) {
        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] breaks = breakingRecords(scores);
        System.out.println("highest breaks : " + breaks[0] + " lowest breaks : " + breaks[1]);
    }

    public static int[] breakingRecords(int[] scores) {
        int max = scores[0];
        int min = scores[0];
        int maxCount = 0;
        int minCount = 0;

        for(int score : scores) {
            if(score > max) {
                maxCount++;
                max = score;
            }else if(score < min) {
                minCount++;
                min = score;
            }
        }

        int[] breaks = {maxCount, minCount};
        return breaks;
      //  return new int[]{maxCount, minCount};
    }
}
