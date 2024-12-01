package constructor;

public class Constructor03 {
    private int i;
    private static int j = 3;
    public Constructor03() {
        i = 15;
        System.out.println("constructor");
        System.out.println("in constructor i : " + i);
    }

    public static void main(String[] args) {
        Constructor03 constructor03 = new Constructor03();
        System.out.println("in main method i : " + constructor03.i);

        Constructor03.say();
        say();
    }


    private static void say() {
        System.out.println(j);
    }
}
