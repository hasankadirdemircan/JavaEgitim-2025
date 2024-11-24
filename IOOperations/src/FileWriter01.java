import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class FileWriter01 {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        //Before Java7
        try {
            fileWriter = new FileWriter("fileWriter.txt");
           // fileWriter = new FileWriter("fileWriter.txt", true);
            fileWriter.write("merhaba ");
            fileWriter.write("abc ");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("next line");
            fileWriter.write("\n");
            fileWriter.write("new line");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileWriter.close();
        }


        //After Java7
        //try with resources
        try(FileWriter fileWriter2 = new FileWriter("fileWriter2.txt")) {
            fileWriter2.write("merhaba ");
            fileWriter2.write("abc ");
            fileWriter2.write(System.lineSeparator());
            fileWriter2.write("next line");
            fileWriter2.write("\n");
            fileWriter2.write("new line");
        } catch (IOException | ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}
