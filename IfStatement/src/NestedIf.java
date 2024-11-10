public class NestedIf {
    public static void main(String[] args) {
        int number1 = 5;

        if(number1 > 10) {
            System.out.println("processing..");
            int number2 = 15;

            if(number2 < 8) {
                System.out.println("number2 < 8");
            }else {
                System.out.println("number2 >= 8");
            }
        }
    }
}
