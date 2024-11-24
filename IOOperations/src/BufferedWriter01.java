import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {
    public static void main(String[] args) {
        //try with resources
        try(FileWriter fileWriter = new FileWriter("bufferedWriter.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("hello world! \n");
            bufferedWriter.write("Java");
            bufferedWriter.newLine();
            bufferedWriter.write("hello again!");
        }catch (IOException e) {
            System.out.println("exception e : " + e);
        }
    }
}
