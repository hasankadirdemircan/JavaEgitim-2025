package constructor;

import java.io.FileWriter;
import java.util.Random;

public class ConstructorOverloading01 {

    ConstructorOverloading01() {
        System.out.println("no-arg constructor");
    }

    ConstructorOverloading01(String name) {
        System.out.println("name param constructor");
    }

    ConstructorOverloading01(int value) {
        System.out.println("value param constructor");
    }

    ConstructorOverloading01(String name, int value) {
        System.out.println("name, value params constructor");
    }

    ConstructorOverloading01(String name, String id) {
        System.out.println("name, id params constructor");
    }

    ConstructorOverloading01(String name, String id, boolean isCached) {
        System.out.println("name, id, isCached params constructor");

    }

    public static void main(String[] args) {
        ConstructorOverloading01 constructorObject01 = new ConstructorOverloading01("test" ,"b", true);
        ConstructorOverloading01 constructorObject02 = new ConstructorOverloading01("test" ,"b");
        ConstructorOverloading01 constructorObject03 = new ConstructorOverloading01("test");
        ConstructorOverloading01 constructorObject04 = new ConstructorOverloading01(1);
        ConstructorOverloading01 constructorObject05= new ConstructorOverloading01();

        Random random1 = new Random(344);
        Random random2 = new Random();

        try(FileWriter fileWriter = new FileWriter("test.txt", true)){

        }catch (Exception e) {

        }


    }
}
