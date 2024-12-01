package constructor;

import java.util.Random;

public class Constructor02 {
    Constructor01 constructor01;
    String secretKey;
    Constructor02() {
        System.out.println("Called Constructor02");
        constructor01 = new Constructor01();
        secretKey = "1111";
    }

    public static void main(String[] args) {
        Constructor02 constructor02 = new Constructor02();
        constructor02.callSayHi();
        constructor02.callSum();

        Random random = new Random();
        int randomNumber = random.nextInt(7)+1;
    }

    public void callSayHi() {
        constructor01.sayHi();
    }

    public void callSum() {
        int result = constructor01.sum(3, 6);
        System.out.println("result : " + result);
    }

    public void connectToCloud() {
       // secretKey
    }
}
