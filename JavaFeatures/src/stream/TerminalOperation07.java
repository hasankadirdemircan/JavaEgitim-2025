package stream;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TerminalOperation07 {
    public static void main(String[] args) {
        String frenchCounting = "un:deux:trois:quatre";
        List<String> gmailList = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toList());


        List<String> gmailList1 = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .toList();

        System.out.println(gmailList);
        System.out.println(gmailList1);

        Map<String, Integer> nameLength = List.of("Arnold", "Alois", "Schwarzenegger")
                .stream()
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println(nameLength);


        List<String> list = List.of("w", "o", "l", "f", "f");
        TreeSet<String> set = list.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);
    }
}
