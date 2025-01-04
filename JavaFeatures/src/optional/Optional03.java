package optional;

import java.util.Optional;

public class Optional03 {

    public static void main(String[] args) {
        Optional<String> opt1 = Optional.ofNullable(null);
        System.out.println(opt1.map(String::length).orElse(-1));

        String nullValue = null;
        if(nullValue == null) {
            System.out.println(-1);
        }else {
            System.out.println(nullValue.length());
        }
    }
}
