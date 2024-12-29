package predicate;

import java.util.List;
import java.util.function.Predicate;

public class Predicate05 {
    public static void main(String[] args) {
        Predicate<String> predicate = String::isEmpty;
        Predicate<String> predicate2 = str -> str.isEmpty();

        System.out.println(predicate2.test(""));

        List<String> nameList = List.of("kadir", "a", "b", "", "", "c");

        System.out.println(nameList);


        List<String> nameList2 = nameList.stream().filter(e -> !e.isEmpty()).toList();
        System.out.println("nameList : " + nameList2);
    }
}
