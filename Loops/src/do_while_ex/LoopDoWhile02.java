package do_while_ex;

import java.util.Random;

public class LoopDoWhile02 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomZar1, randomZar2;
        int sayac = 0;

        do {
            randomZar1 = random.nextInt(6) + 1;
            randomZar2 = random.nextInt(6) + 1;
            sayac++;
            System.out.println("randomZar1 : " + randomZar1 + " randomZar2 : " + randomZar2);
        }
        while ( randomZar1 != 6 || randomZar2 != 6 );
        System.out.println("Tebrikler " + sayac  +". ıncı Atılan zar Geldi" + " ZAR1 DEĞERİ " + randomZar1 + " ZAR2 DEĞERİ " +randomZar2);
    }
}
