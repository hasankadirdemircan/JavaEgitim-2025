package while_ex;

import java.util.Scanner;

public class LoopWhile02 {
    public static void main(String[] args) {
        int assumption = 15;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("tahmininizi giriniz: ");
            int usersIn = scanner.nextInt();
            System.out.println("kullanıcı girdiği sayi : " + usersIn);

            if(usersIn == assumption) {
                break;
            }
        }

        System.out.println("tebrikler tahminimi buldunuz!");
    }
}
