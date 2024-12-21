package recap;

import interface_ex.B;

import java.io.*;

public class FileWriterReaderExample01 {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("test.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.newLine();

            bufferedWriter.write("hello");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("world!");
        }catch (IOException ex) {
            System.out.println("ex : " + ex);
        }

        System.out.println("reader-----");
        try(FileReader fileReader = new FileReader("test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException ex) {
            System.out.println("ex : " + ex);
        }
    }


}
