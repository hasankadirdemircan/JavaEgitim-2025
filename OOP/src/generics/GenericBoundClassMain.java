package generics;

public class GenericBoundClassMain {
    public static void main(String[] args) {
        GenericBoundClass<Long> genericBoundClass = new GenericBoundClass<>();
        genericBoundClass.display();

        GenericBoundClass<Double> genericBoundClass2 = new GenericBoundClass<>();
        genericBoundClass2.display();

        /*GenericBoundClass<String> genericBoundClass3 = new GenericBoundClass<>();
        genericBoundClass3.display();
        ERROR : Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
        */

    }
}
