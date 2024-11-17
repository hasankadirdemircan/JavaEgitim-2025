package for_ex;

import java.util.Scanner;

public class NestedForLoop06_Homework {

    /*
        Kullanıcıdan alınan sayının faktöriyelini hesaplayıp ekrana yazdıran java programı.

        5! -> 5'in faktoriyeli veya 5 faktoriyel
        5! = 5 * 4 * 3 * 2 * 1
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyelini alacağımız sayıyı giriniz! ");
        int faktoriyel = scanner.nextInt();
        int sonuc = 1;
       /* for(int i=faktoriyel; i>1; i--) {
            System.out.println(i);
            sonuc = sonuc * i;
        }*/

        for(int i=2; i<=faktoriyel; i++) {
            System.out.println(i);
            sonuc = sonuc * i;
        }

        System.out.println(faktoriyel + "! = " + sonuc);
    }
}
