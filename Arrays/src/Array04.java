import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 3, 2, 6, 5};
        int[] newArray = new int[6];
        for(int i=numbers.length-1; i>=0; i--) {
           // System.out.println(numbers[i]);
            newArray[(numbers.length-1) - i] = numbers[i];
        }

        System.out.println("reversed : ");
       /* for(int number: newArray) {
            System.out.print(number + ", ");
        }*/
        System.out.println(Arrays.toString(newArray));
    }
}
