package for_ex;

public class NestedForLoop04 {

    /*


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

    public static void main(String[] args) {
        for(int i=10; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("2.");
        for(int i=1; i<=10; i++) {
            for(int j=10; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
