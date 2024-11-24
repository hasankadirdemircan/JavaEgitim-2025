import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling01 {
    public static void main(String[] args) {

        int number1 = 5;
        try {
            System.out.println(number1/0);
            FileReader file = new FileReader("test.txt");
            System.out.println("will it work?");
        }catch (IOException e) {
            System.out.println("exception caught , error details : " + e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println("exception caught , error details : " + e.getMessage());
        }catch (Exception e) {
            System.out.println("exception caught , error details : " + e.getMessage());
        }finally {
            System.out.println("here is finally code block");
            //connection close operations.
        }
        System.out.println("program will be closed.");
    }


}