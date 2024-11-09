//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IfExample01 {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;
        if(number2 >= number1) {
            System.out.println("cevap true");
            System.out.println("cevap true2");
        }

        if(number1 >= number2)
            System.out.println("second if");
            System.out.println("second if2");

     /*   if(number1 >= number2) {
            System.out.println("second if");
        }
        System.out.println("second if2");
      */
        System.out.println("uygulama kapanıyor.");
    }
}