package algorithm;

public class AppleAndOrange {

    public static void main(String[] args) {
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};
      //  countApplesAndOranges(7, 10, 4, 12, {2, 3, -4}, {3, -2, -4})
        countApplesAndOranges(7, 11, 5, 15, apples, oranges);
    }


    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        //for apples
        int samAppleCount = 0;
        int samOrangeCount = 0;
        for (int apple : apples) {
            int samAppleBorderCalculate = a + apple;
            if (samAppleBorderCalculate >= s && samAppleBorderCalculate <= t) {
                samAppleCount++;
            }
        }

        for (int orange : oranges) {
            int samOrangeBorderCalculate = b + orange;
            if(samOrangeBorderCalculate <= t && samOrangeBorderCalculate >= s) {
                samOrangeCount++;
            }
        }

        System.out.println("Sam will eat samAppleCount : " + samAppleCount);
        System.out.println("Sam will eat samOrangeCount : " + samOrangeCount);

    }
}
