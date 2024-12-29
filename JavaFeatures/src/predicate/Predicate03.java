package predicate;

import java.util.List;
import java.util.function.Predicate;

public class Predicate03 {
    public static void main(String[] args) {
        Predicate<String> nullCheckPredicate = e -> e != null;
        Predicate<String> lengthCheckPredicate = e -> e.length() > 2;

        Predicate<String> andPredicate = nullCheckPredicate.and(lengthCheckPredicate);

        String temp1 = null;
        String temp2 = "java8";
        String temp3 = "hasan";
        String temp4 = "k";
        String temp5 = "demircan";
        String temp6 = "ja";

        System.out.println("temp1 : " + andPredicate.test(temp1));
        System.out.println("temp2 : " + andPredicate.test(temp2));
        System.out.println("temp3 : " + andPredicate.test(temp3));
        System.out.println("temp4 : " + andPredicate.test(temp4));
        System.out.println("temp5 : " + andPredicate.test(temp5));
        System.out.println("temp6 : " + andPredicate.test(temp6));

        List<String> names = List.of("java8", "ja", "hasan", "kadir", " demircan", "hello", "k");

        List<String> filtered = names.stream().filter(andPredicate).toList();
        System.out.println(filtered);

        List<String> filtered2 = names.stream().filter(nullCheckPredicate.and(lengthCheckPredicate)).toList();
        System.out.println(filtered2);


        List<String> filtered3 = names.stream().filter(e -> e != null && e.length() > 2).toList();
        System.out.println(filtered3);
    }
}
