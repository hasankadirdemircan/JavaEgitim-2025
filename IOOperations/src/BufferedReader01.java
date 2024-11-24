import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {
    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("bufferedWriter.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String data;
            while((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        }catch (IOException e) {
            System.out.println("exception e : " + e);
        }
    }
}
