public class ShortIfElse {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;

        if(number1 < number2) {
            System.out.println(number1 + " kücüktür");
        }else {
            System.out.println(number2 + " kücüktür.");
        }

        int enKucukSayi = (number1 < number2) ? number1 : number2;
        System.out.println("en kucuk sayi : " + enKucukSayi);


    }
}
