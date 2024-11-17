import java.util.Scanner;

public class LoopExample01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        while(true) {
            System.out.println("sayı giriniz: ");
            sayi = scanner.nextInt();
            if(sayi == 0) {
                System.out.println("0 rakamını girdiniz: Girilen sayıların " +
                        "toplamı hesaplanıyor...");
                break;
            }
            toplam = toplam + sayi;
        }

        System.out.println("Toplam : " + toplam);
    }
}
