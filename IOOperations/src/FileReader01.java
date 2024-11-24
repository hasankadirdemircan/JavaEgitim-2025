import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;

        //Before Java7
        try {
            fileReader = new FileReader("fileWriter.txt");
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("error : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        } finally {
            fileReader.close();
        }


        //After Java8
        try (FileReader fileReader2 = new FileReader("fileWriter.txt")) {
            int i;
            while ((i = fileReader2.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException | ArithmeticException e) {
            System.out.println("error : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
}
