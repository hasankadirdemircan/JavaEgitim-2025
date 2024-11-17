import java.util.Arrays;

public class Array05 {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,6,14,9,1};
      //  {3,4,5,6,1,14,9}; -> 1,3,4,5,6,9,14 hazır method YASAK. Döngülerle yapınız.!
        int temp;
        for(int i=0; i<numbers.length-1; i++) {
            System.out.println("yeni iterasyondaki arrayin son hali : ");
            System.out.println(Arrays.toString(numbers));
            for(int j=0; j<numbers.length-1-i; j++) {
                System.out.println("numbers.length-1-i : " + (numbers.length-1-i));
                System.out.println("j : " + j);
                System.out.println("numbers[j] : " + numbers[j]);
                System.out.println("numbers[j] : " + numbers[j+1]);

                if(numbers[j] > numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        System.out.println("en son hali : ");
        System.out.println(Arrays.toString(numbers));
    }
}
