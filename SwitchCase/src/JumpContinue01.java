public class JumpContinue01 {
    public static void main(String[] args) {
        int number = 10;

        for(int i=0; i<=10; i++) {
            if(i == 2) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("uygulama kapanıyor.");
    }
}
