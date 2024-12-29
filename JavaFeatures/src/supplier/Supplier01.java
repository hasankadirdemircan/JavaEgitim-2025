package supplier;

import java.util.List;
import java.util.function.Supplier;

public class Supplier01 {
    public static void main(String[] args) {
        Supplier<String> supplier01 = () -> "Supplier Example";
        System.out.println(supplier01.get());
    }
}
/*
predicate -> parameter -> boolean, test
consumer -> parameter -> void, accept
function -> parameter -> parameter, apply
supplier -> void -> parameter, get
 */