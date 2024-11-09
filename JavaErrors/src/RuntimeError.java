public class RuntimeError {
    public static void main(String[] args) {
        System.out.println("Uygulama çalışmaya başladı.");

        System.out.println("matematiksel işlemler yapılacak.");
        int number1 = 10;
        int number2 = 2;
        if(number2 != 0) {
            double result = number1 / number2;
            System.out.println("sonuc : " + result);
        }

        System.out.println("uygulama kapanıyor.");
    }
}
