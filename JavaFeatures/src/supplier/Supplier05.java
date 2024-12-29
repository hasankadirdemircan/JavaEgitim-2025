package supplier;

import java.util.Optional;

public class Supplier05 {
    private static String staticName = "static name";

    public static void main(String[] args) {
        String name = findNameById(2L).orElseGet(() -> staticName);
        System.out.println(name);

    }

    private static Optional<String> findNameById(Long id) {
        String name = null;
        if(id == 1L) {
            name = "java8";
        }

        return Optional.ofNullable(name);
    }
}
