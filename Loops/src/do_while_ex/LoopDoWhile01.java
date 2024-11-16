package do_while_ex;

public class LoopDoWhile01 {

    public static void main(String[] args) {
        int startValue = 15;
        do {
            System.out.println("start value : " + startValue);
            startValue++; // startValue = startValue + 1;
        }while(startValue <= 5);

        System.out.println("exit");
    }
}
