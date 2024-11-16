package while_ex;

import java.util.Random;
import java.util.Scanner;

public class LoopWhile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sayac = 0;
        int randomZar1, randomZar2;
        int zar1, zar2;
    /*   for(int i=1; i<=100; i++) {
            System.out.println( random.nextInt(6)+2);
        }*/

        System.out.println("1. zarın değerini giriniz: ");
        zar1 = scanner.nextInt();
        System.out.println("2. zarın değerini giriniz: ");
        zar2 = scanner.nextInt();

        while(true) {
            randomZar1 = random.nextInt(6)+1;  // son sınır = x -1 , + dan sonrası da başlangıç oluyor.
            randomZar2 = random.nextInt(6)+1;
            sayac = sayac + 1; //sayac++
            System.out.println(sayac + " . atış randomZar1 : " + randomZar1 + " randomZar2 : " + randomZar2);

            if(((zar1 == randomZar1) || (zar1 == randomZar2)) && ((zar2 == randomZar1) || (zar2 == randomZar2))) {
                System.out.println("tebrikler "+ sayac + " atışta" +" 5bin kazandınız.! ");
               break;
            }
        }

        //1 -5 -> 10 bin
        //5- 15 -> 5 bin
        //15--30 -> 1bin
        //30 dan 1 adet freespin

// zar1 = 5, zar2 = 3
//random zar1 = 3 , zar2=5

    }
}
