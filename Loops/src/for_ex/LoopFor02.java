package for_ex;

import java.util.Scanner;

public class LoopFor02 {

    public static void main(String[] args) {
        int count=0,deger;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Başlangıç Değerini Girin: ");
        deger=scanner.nextInt();
        for(int i=1;i<=deger;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("1'den başlayarak girmiş olduğunuz "+deger+" değerine kadar"+count+" çift sayı vardır.");
    }
}
