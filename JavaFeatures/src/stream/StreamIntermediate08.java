package stream;

import java.util.Arrays;

public class StreamIntermediate08 {

    public static void main(String[] args) {
        String[] string = "you never know what you have until you clean your room".split(" ");
        Arrays.stream(string)
                .map(word -> word.split(""))
                .distinct()
                .forEach(System.out::println);

        System.out.println("flatMap");

        Arrays.stream(string)
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .forEach(System.out::println);
    }
}
