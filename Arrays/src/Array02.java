public class Array02 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
     /*   numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;*/
      //  numbers[5] = 6;  Index 5 out of bounds for length 5

        for(int i=0; i<5; i++) {
           numbers[i] = i+1;
        }

        int[] numbers2 = {1,2,3,4,5,6};
        System.out.println();

        System.out.println(numbers2[2]);
       // System.out.println(numbers2[5]); Index 5 out of bounds for length 5
        //numbers2.length -> numbers2 arrayindeki sayı adedini döndürür.
        System.out.println("numbers2 array");
        for(int i=0; i<numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        //foreach
        System.out.println("foreach");
        for(int number : numbers2) {
            System.out.println(number);
        }
    }
}
