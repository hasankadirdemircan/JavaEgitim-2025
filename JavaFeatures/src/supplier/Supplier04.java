package supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Supplier04 {
    public static void main(String[] args) {
        List.of("Java8", "Supplier", "Example").stream().forEach(name -> {
            printNames(() -> name);
        });

        List<String> stringList = Stream.generate(Supplier04::createNewString)
                .limit(10)
                .toList();
        System.out.println(stringList.size());
        System.out.println(stringList);

    }

    private static void printNames(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    private static String createNewString() {
        return new String("a");
    }
}
