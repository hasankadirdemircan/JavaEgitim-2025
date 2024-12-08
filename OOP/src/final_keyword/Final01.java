package final_keyword;

final public class Final01 {

    public static void main(String[] args) {
        String x = "Java";

        x = x.concat(" Developer"); //String immutable
        System.out.println(x);

        int number = 5;
        number = 10; // non immutable

        final int number2 = 10;
      //  number2 = 230;
    }
}
