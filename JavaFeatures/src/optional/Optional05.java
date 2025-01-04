package optional;

import java.util.Optional;

public class Optional05 {
    public static void main(String[] args) {
        threeDigit(Optional.of(212));
        threeDigitV2(Optional.of(212));
    }


    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3)
                System.out.println(string);
        }
    }

    private static void threeDigitV2(Optional<Integer> optional) {
        optional.map(e -> "" + e)
                .filter(e -> e.length() == 3)
                .ifPresent(System.out::println);
    }
}