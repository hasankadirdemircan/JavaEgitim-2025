package exception_handling;

import java.io.*;
import java.util.zip.ZipOutputStream;

public class ExceptionHandling02 {
    public static void main(String[] args) {
        //Before Java7
        FileWriter fw = null;
        try {
            fw = new FileWriter("file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
            }
        }

        //After Java7
        try (ZipOutputStream zipFile = new ZipOutputStream(new FileOutputStream("zipFileName"));
             FileInputStream fileIn = new FileInputStream("file.txt")) {
            //
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (FileWriter fw2 = new FileWriter("file2.txt");
             FileWriter fw3 = new FileWriter("file2.txt")) {

            fw2.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //public interface Closeable extends AutoCloseable {
    }
}
