import java.io.File;
import java.io.IOException;

public class CreateFolder01 {

    public static void main(String[] args) {
        File directory = new File("myDir");
        boolean bool = directory.mkdir();
        System.out.println(bool);
        System.out.println(directory.isDirectory());
        System.out.println(directory.isFile());
        System.out.println(directory.getAbsolutePath());

        File file = new File(directory, "file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        file.delete();
        directory.delete();
    }
}
