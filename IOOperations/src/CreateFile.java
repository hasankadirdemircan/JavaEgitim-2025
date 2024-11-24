import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        File file = new File("file.txt");
        System.out.println(file.exists());
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println(file.exists());
        }
        System.out.println(file.getAbsoluteFile());
    //    System.out.println(file.delete());
        System.out.println(file.exists());
        System.out.println(file.getParent());
        System.out.println(file.getTotalSpace());
        System.out.println(file.isDirectory());
    }
}
