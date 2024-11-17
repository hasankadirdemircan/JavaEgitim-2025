package for_ex;

/*

       Aşağıdaki şekli veren java programını yazınız.


            * * * * * * * * * *
             * * * * * * * * *
              * * * * * * * *
               * * * * * * *
                * * * * * *
                 * * * * *
                  * * * *
                   * * *
                    * *
                     *

 */
public class NestedForLoop05 {

    public static void main(String[] args) {
        for(int k=10; k>=1; k--){
            for (int j=10; j>= k+1; j--) {
                System.out.print(" ");
            }

            for(int h=1; h<=k; h++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
