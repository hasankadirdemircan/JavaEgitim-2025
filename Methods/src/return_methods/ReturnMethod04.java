package return_methods;

public class ReturnMethod04 {
    /*
    main method içerisinde 1,2,3,4,5,6,7,8,9,10 bir array tanımlayın.
    bu array'i yazacağınız bir methoda yollayın.
    o method içerisinde array'i şu hale çevirin; 10,9,8,7,6,5,4,3,2,1 (tersine)
    bunu return ederek main method içerisinde ekrana yazdırın.
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ReturnMethod04 returnMethod04 = new ReturnMethod04();
        numbers = returnMethod04.reverseArray(numbers);

        for(int number : numbers) {
            System.out.println(number);
        }
    }

    int[] reverseArray(int[] numbers) {
        int[] newArray = new int[numbers.length];
        for(int i=numbers.length; i>0; i--) {
            newArray[numbers.length-i] = numbers[i-1];
        }

        return newArray;
    }
}
