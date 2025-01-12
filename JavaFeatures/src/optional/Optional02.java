package optional;

import java.util.Optional;

public class Optional02 {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.ofNullable(null);

        opt1.ifPresent(System.out::println);

        Optional<String> string = Optional.of("  abracadabra  ");
        string.map(String::trim)
                .ifPresent(System.out::println);
    }
}
