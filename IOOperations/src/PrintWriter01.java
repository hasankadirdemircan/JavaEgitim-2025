import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter01 {
    public static void main(String[] args) {

        try(PrintWriter printWriter = new PrintWriter("printWriter.txt")) {
            printWriter.println("hello");
            printWriter.print("world");
            printWriter.print("!!!");
        }catch (IOException e) {
            System.out.println("exception e : " + e);
        }
    }
}
