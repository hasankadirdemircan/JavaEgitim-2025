package functional_interface;

public class StringTransformerMain {
    public static void main(String[] args) {
        String inputText = "Merhaba Dünya!";

        StringTransformer toUpperCaseTransformer = (String input) -> input.toUpperCase();

        String transformedText = toUpperCaseTransformer.transform(inputText);

        System.out.println("original : " + inputText);
        System.out.println("trasformedText : " + transformedText);
    }
}
