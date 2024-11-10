public class JumpContinue02 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("uygulama kapanıyor.");
    }
}
