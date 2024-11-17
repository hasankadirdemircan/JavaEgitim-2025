package for_ex;

import java.util.Scanner;

/*

     Kullanıcının girdiği yıldız kadar taban yıldızı olsun.
     Mesela 10 girdiyse;
          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *
    * * * * * * *
   * * * * * * * *
  * * * * * * * * *
 * * * * * * * * * *

 Mesela 3 girdiyse;
    *
   * *
  * * *
   */
public class NestedForLoop06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("taban yıldız sayısını giriniz! ");
        int rowCount = scanner.nextInt();
        for(int i=1; i<=rowCount; i++) {
            for(int j=1; j<=rowCount-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
