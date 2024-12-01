package constructor;

public class Constructor04 {

    String language;

    Constructor04(String language) {
        this.language = language;
        System.out.println(language + " programming language");
    }

    public static void main(String[] args) {
        Constructor04 constructor04 = new Constructor04("Java");
        System.out.println(constructor04.language);

        Constructor04 constructor = new Constructor04("Python");
        System.out.println(constructor.language);
    }
}
