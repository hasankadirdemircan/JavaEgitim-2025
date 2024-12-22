package generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericClassTest01 {

    public static void main(String[] args) {

        GenericClass01<String> genericClass01 = new GenericClass01<>("hello");

        System.out.println(genericClass01.getData());

        GenericClass01<Integer> genericClass02 = new GenericClass01<>(4);
        System.out.println(genericClass02.getData());

        GenericClass01<List<String>> genericClass03 = new GenericClass01<>(List.of("a", "b", "c"));
        System.out.println(genericClass03.getData());

    }
}
