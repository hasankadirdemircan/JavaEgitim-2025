import java.io.FileWriter;
import java.io.IOException;
//NOT: eğer 3rd party bir yere istek atıyorsak try-catch kullanılması önerilir.
//çünkü request, response loglamaları için
public class UnCheckedException01 {
    public static void main(String[] args) {

//checked exception
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int number1 = 5;
        int number2 = 0;
        if(number2 != 0) {
            int result = number1 / number2;
        }

        String name = null;
        if(name != null) {
            System.out.println(name.toLowerCase());
        }
    }
}
