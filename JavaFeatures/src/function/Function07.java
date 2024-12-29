package function;

import java.util.function.Function;

public class Function07 {
    public static void main(String[] args) {
        Function<String, String> extractNumbers = text -> {
            StringBuilder numbers = new StringBuilder();
            for(char c : text.toCharArray()) {
                if(Character.isDigit(c)){
                    numbers.append(c);
                }
            }
            return numbers.toString();
        };

        String sentence = "I have 3 apples and 5 oranges.";
        String extractNumbersString = extractNumbers.apply(sentence);
        System.out.println(extractNumbersString);

        Function<String, Integer> extractNumbers2 = text -> {
            int sum = 0;
            for(char c : text.toCharArray()) {
                if(Character.isDigit(c)){
                    sum = sum + Integer.parseInt(Character.toString(c));
                }
            }
            return sum;
        };

        System.out.println(extractNumbers2.apply(sentence));

    }
}
