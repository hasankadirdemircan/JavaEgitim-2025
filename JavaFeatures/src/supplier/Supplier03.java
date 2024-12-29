package supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class Supplier03 {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args) {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());

        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        LocalDateTime localDateTime = supplier02.get();
        System.out.println(localDateTime);

        Supplier<String> supplier03 = () -> dtf.format(LocalDateTime.now());
        String localDateFormatter = supplier03.get();
        System.out.println(localDateFormatter);
    }
}
