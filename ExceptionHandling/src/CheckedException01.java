import java.io.FileWriter;
import java.io.IOException;

public class CheckedException01 {

    public static void main(String[] args) {
        //checked exception
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
