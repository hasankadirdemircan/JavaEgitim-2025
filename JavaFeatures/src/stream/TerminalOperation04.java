package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalOperation04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("monkey", "2", "chimp");

        List<String> list2 = List.of("20", "3", "10");
        List<String> list3 = List.of("ab23c", "xx23x", "yuyy1");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false

        System.out.println(list2.stream().noneMatch(pred)); // true
        System.out.println(list2.stream().allMatch(pred)); // false
        System.out.println(list3.stream().allMatch(pred)); // true
    }
}
