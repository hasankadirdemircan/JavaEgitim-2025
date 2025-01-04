package optional;

import java.util.Optional;

public class Optional01 {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();

        Optional<String> opt1 = Optional.of("value");
        System.out.println(opt1.get());
        System.out.println(emptyOptional);
    }
}
