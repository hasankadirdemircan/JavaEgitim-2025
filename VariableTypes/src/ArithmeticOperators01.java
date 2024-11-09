public class ArithmeticOperators01 {

    public static void main(String[] args) {
        double number1 = 5;
        double number2 = 6;

        double sum = number1 + number2;
        double minus = number1 - number2;
        double multipy = number1 * number2;
        double divide = number1 / number2;

        System.out.println("iki sayının toplamı: " + sum);
        System.out.println("iki sayının farkı: " +minus);
        System.out.println("iki sayının çarpımı: " + multipy);
        System.out.println("iki sayının bölümü: " + divide);

        System.out.println("iki sayının toplamı: " + (number1 + number2));
    }
}
