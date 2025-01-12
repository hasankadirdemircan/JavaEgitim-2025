package exception_handling;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandling01 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("test.txt");
        }catch (ArithmeticException e) {
            System.out.println(e);
        }catch (IOException e) {
            System.out.println(e);
        }catch (RuntimeException e) {
            System.out.println(e);
        }


        try{
            FileWriter fw = new FileWriter("test.txt");
        }catch (ArithmeticException | IOException e) {
            System.out.println(e);
        }catch (RuntimeException e) {
            System.out.println(e);
        }

    }
}
