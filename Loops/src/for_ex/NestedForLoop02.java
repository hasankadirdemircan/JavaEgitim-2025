package for_ex;

public class NestedForLoop02 {

    public static void main(String[] args) {
        /*
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        1 * 4 = 4
        -----
        1 * 10 = 10

        ----

        10 * 1 = 10
        10 * 2 = 20
        --
        10 * 10 = 100
         */

        System.out.println();


        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
