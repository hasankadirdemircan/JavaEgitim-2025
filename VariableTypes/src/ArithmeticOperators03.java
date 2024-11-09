public class ArithmeticOperators03 {

    public static void main(String[] args) {
      int number1 = 10;
      System.out.println("number1: " + number1++);
      System.out.println(number1);

      int number2 = 16;
      System.out.println("number2: " + number2--);
      System.out.println("number2: " + number2);


      int number3 = 20;
      System.out.println("number3: " + ++number3);
      System.out.println("number3: " + number3);

      int number4 = 26;
      System.out.println("number4: " + --number4);

      boolean condition = false;
      System.out.println("condition : " + !condition);
    }
}
