import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * @author hasan.demircan
 * @since 2024/11/24
 */
public class JavaDoc01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
    }


    // sum adında void bir method, number1 ve number2 parametrelerini alıyor.
    // Test
    /*
    Test1
    Test2
     */

    /**
     *
     * @param number1
     * @param number2
     * @return sum of the params
     *  @see <a href="https://docs.oracle.com/en/java/javase/11/tools/javadoc.html#GUID-9D532574-1CDB-4D30-99F3-A308DCAEE55F">Java Doc</a>
     */
    @Deprecated
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }


    public static int sum(int number1) {
        return number1 + 3;
    }
}