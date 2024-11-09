public class IfElseExample01 {

    public static void main(String[] args) {

        int number = 10;

        //Example1
        if(number > 10) {
            System.out.println("this number bigger than 10");
        }else {
            System.out.println("this number lower than 10");
        }

        //Example2
        if(number > 10) {
            System.out.println("this number bigger than 10");
        }else if(number == 10) {
            System.out.println("this number equals to 10");
        }else {
            System.out.println("this number lower than 10");
        }


        //Example3
        if(number >= 10) {
            System.out.println("this number bigger than 10");
        }

        if(number == 10) {
            System.out.println("this number equals to 10");
        }else {
            System.out.println("this number lower than 10");
        }
    }
}
